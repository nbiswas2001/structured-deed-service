package uk.gov.ros.lr.deed.structured.interpreter.preprocessors;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
import uk.gov.ros.lr.deed.structured.model.parserdata.PartyName;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartyNamePreProcessor {

    //----------------------------------------------------------------------
    //Pattern to get the full block of text that get's a name in all caps.
    // Note non asciis such as ¥ have already been replaced with blanks i.e. ' '. Also '.' has been replaced with ' '
    //      [A-Z] = Starts with uppercase
    //      [A-Zc'10]? = optional - another uppercase alphabets or ' for O'Donnel / c for McDONALD, 1 & 0 for ocr errors on I and O
    //      (?:[^,a-z2-9()\+ ])* = optional - a list of chars not appearing in the set (incl. space, 1 and 0)
    private static final Pattern upperCaseNamePartRegex = Pattern.compile("[A-Z1][A-Zc'10]?[^,a-z2-9()\\+ ]*");

    //-------------------------------------------------------------------------------------
    //Same as above but for named with camel case (for Grantee names prior to 11/12/1972)
    //      [A-Z] = Starts with uupercase
    //      [a-z']? = optional - lowercase alhpahbets or ' for O'Donnel
    //      [^,A-Z2-9()\+ ]* = optional - a list of chars not appearing in the set (incl. space, 1 and 0)
    private static final Pattern camelCaseNamePartRegex = Pattern.compile("[A-Z][a-z']?[A-Z10]?[^,A-Z2-9()\\+ ]*");

    //-------------------------------------------------------------------------------------
    private static final Map<Pattern, String> joinTxtRegexes = new HashMap<>();
    static {
        joinTxtRegexes.put(Pattern.compile("[ ]+"), " ");
        joinTxtRegexes.put(Pattern.compile("(?: +(?:OR|or) +)"), " or ");
        joinTxtRegexes.put(Pattern.compile("(?: +(?:OF|of) +)"), " of ");

        joinTxtRegexes.put(Pattern.compile("(?: +(?:[a-z]) +)"), " ");
        joinTxtRegexes.put(Pattern.compile("(?: *[\\(]) *"), " (");
        joinTxtRegexes.put(Pattern.compile("(?: *[\\)]) *"), ") ");
    }

    //----------------------------------------------------------------------------
    private static final Set<String> commonPlaceNameParts = new HashSet<>(Arrays.asList(
            " Apartment", " Avenue", "Circle ", " Cottage", "Cottages", " Court", " Crescent", " Drive", " Farm",
            " Gardens", " House", " Hotel", " Park", " Place", " Road", " Street", " Terrace", " Town"));


    //-------------------------------------------------------------------------------------------------------------
    public static String process(String txt, List<String> racParties, List<PartyName> partyNames) {

        if(!txt.isEmpty()) {

            //This only gets called for the Grantee section
            //for the case 'said J W Smith' directly match with already added PartyNameBlocks
            txt = captureReferencedParties(txt, partyNames);

            //capture names that appear in upper-case
            txt = captureNamesUpperCase(txt, partyNames, racParties);

            //capture names that appear in camel-case
            txt = captureNamesCamelCase(txt, partyNames, racParties);
        }
        return txt;
    }

    //------------------------------------------------------------------------------------------------------
    private static String captureReferencedParties(String txt, List<PartyName> partyNames){
        if(txt.contains("said ")){
            for(PartyName pn : partyNames){
                int startPos = txt.toLowerCase().indexOf(pn.getText().toLowerCase());
                if(startPos > 0){
                    StringBuilder sb = new StringBuilder();
                    sb.append(txt.substring(0, startPos));
                    sb.append(pn.getToken());
                    sb.append(txt.substring(startPos+pn.getText().length(), txt.length()));
                    txt =  sb.toString();
                }
            }
        }
        return txt;
    }

    //---------------------------------------------------------------------
    private static final int MIN_NAME_SIZE=8;

    private static String captureNamesUpperCase(String txt, List<PartyName> partyNames, List<String> racParties) {
        Matcher m = upperCaseNamePartRegex.matcher(txt);

        Map<Pattern, String> joinRegexes = new HashMap<>(joinTxtRegexes);
        joinRegexes.put(Pattern.compile("\\,"), ",");

        String name = "";
        int lastEndPos = 0;
        int nameStartPos = 0;
        int nameEndPos = 0;
        String part = "";
        String joinTxt = "";
        boolean nameHasMultiParts = false;
        while (m.find()) {
            part = txt.substring(m.start(), m.end());
            if(name.isEmpty()) {
                name = part;
                nameStartPos = m.start();
                nameEndPos = m.end();
                lastEndPos = m.end();
                nameHasMultiParts = false;
            }
            else {
                joinTxt = txt.substring(lastEndPos, m.start());
                boolean isJoin = false;
                for(Pattern joinPatt : joinRegexes.keySet()) {
                    Matcher jm = joinPatt.matcher(joinTxt);
                    if(jm.matches()) {
                        joinTxt = joinRegexes.get(joinPatt);
                        isJoin = true;
                        break;
                    }
                }

                if(isJoin) {
                    name += joinTxt + part;
                    nameHasMultiParts = true;
                    nameEndPos = m.end();
                    lastEndPos = m.end();
                }
                else {

                    if(isTextName(name, nameHasMultiParts)) {
                        addPartyName(name, partyNames, nameStartPos, nameEndPos);
                    }

                    lastEndPos = m.end();
                    name = part;
                    nameStartPos = m.start();
                    nameHasMultiParts = false;
                }
            }
        }

        //the last one
        if(isTextName(name, nameHasMultiParts)) {
            addPartyName(name, partyNames, nameStartPos, nameEndPos);
        }

        StringBuilder sb = new StringBuilder();
        lastEndPos = 0;
        for(PartyName pn : partyNames) {
            if(!pn.isUsed()) {
                matchPartyNameBlockToRacParties(pn, racParties);
                int start = pn.getStartPos();
                sb.append(txt.substring(lastEndPos, start));
                sb.append(pn.getToken());
                pn.setUsed(true);
                lastEndPos = pn.getEndPos();
            }
        }
        sb.append(txt.substring(lastEndPos));

        return sb.toString();
    }

    //-------------------------------------------------------------------------------------------------------------------
    private static String captureNamesCamelCase(String txt, List<PartyName> partyNames, List<String> racParties) {

        //prepare set of party name tokens
        Set<String> racPartyNameTokens = new HashSet<>();
        if (racParties != null) {
            for (String ptyName : racParties) {
                List<String> tokens = Arrays.asList(ptyName.split(" "));
                for (String t : tokens) {
                    racPartyNameTokens.add(t.toUpperCase().trim());
                }
            }
        }

        Matcher m = camelCaseNamePartRegex.matcher(txt);
        String name = "";
        int lastEndPos = 0;
        int nameStartPos = 0;
        int nameEndPos = 0;
        String part = "";
        String joinTxt = "";
        boolean nameHasMultiParts = false;
        while (m.find()) {
            part = txt.substring(m.start(), m.end());
            if (name.isEmpty()) {
                name = part;
                nameStartPos = m.start();
                nameEndPos = m.end();
                lastEndPos = m.end();
                nameHasMultiParts = false;
            } else {
                joinTxt = txt.substring(lastEndPos, m.start());
                boolean isJoin = false;
                for (Pattern joinPatt : joinTxtRegexes.keySet()) {
                    Matcher jm = joinPatt.matcher(joinTxt);
                    if (jm.matches()) {
                        joinTxt = joinTxtRegexes.get(joinPatt);
                        isJoin = true;
                        break;
                    }
                }

                if (isJoin) {
                    name += joinTxt + part;
                    nameHasMultiParts = true;
                    nameEndPos = m.end();
                    lastEndPos = m.end();
                } else {

                    if (isCamelCaseTextName(name, nameHasMultiParts, racPartyNameTokens)) {
                        addPartyName(name, partyNames, nameStartPos, nameEndPos);
                    }

                    lastEndPos = m.end();
                    name = part;
                    nameStartPos = m.start();
                    nameHasMultiParts = false;
                }
            }
        }

        //the last one
        if (isCamelCaseTextName(name, nameHasMultiParts, racPartyNameTokens)) {
            addPartyName(name, partyNames, nameStartPos, nameEndPos);
        }

        StringBuilder sb = new StringBuilder();
        lastEndPos = 0;
        for (PartyName pnb : partyNames) {
            if (!pnb.isUsed()) {
                matchPartyNameBlockToRacParties(pnb, racParties);
                int start = pnb.getStartPos();
                sb.append(txt.substring(lastEndPos, start));
                sb.append(pnb.getToken());
                pnb.setUsed(true);
                lastEndPos = pnb.getEndPos();
            }
        }
        sb.append(txt.substring(lastEndPos));
        return sb.toString();
    }
    //----------------------------------------------------------------------------------------
    private static void addPartyName(String name, List<PartyName> partyNames, int nameStartPos, int nameEndPos) {
        PartyName pn = new PartyName();
        pn.setText(name);

        if(looksLikeOrgName(name)) pn.setOrg(true);
        else setPersonNameParts(pn);

        pn.setStartPos(nameStartPos);
        pn.setEndPos(nameEndPos);
        pn.setIndex(partyNames.size());
        partyNames.add(pn);
    }

    //------------------------------------------------------------------------
    private static boolean isTextName(String name, boolean nameHasMultiParts) {
        return !name.isEmpty()
                && nameHasMultiParts
                && name.length() >= MIN_NAME_SIZE //TODO HACK - due to Mixed cap nemes. Better to ignore those portions of text
                && !isPlace(name);
    }

    //------------------------------------------------------------------------------------

    private static List<String> camelCaseWordsThatIndicateNotNames = Arrays.asList("Trustees", "Executors", "Executor", "Curator", "Executrix");

    private static boolean isCamelCaseTextName(String name, boolean nameHasMultiParts, Set<String>racPartyNameTokens) {

        boolean isOK = isTextName(name, nameHasMultiParts);
        if(isOK) {

            for(String w : camelCaseWordsThatIndicateNotNames) {
                if(name.contains(w)) {
                    isOK = false;
                    break;
                }
            }

            if(isOK) {
                if (isOK) {
                    isOK = false;
                    if (racPartyNameTokens.size() > 0) {
                        String[] nameTokens = name.split(" ");
                        for (String nt : nameTokens) {
                            ExtractedResult result = FuzzySearch.extractOne(nt, racPartyNameTokens);
                            if (result.getScore() > FUZZY_MATCH_THRESHOLD + 10) {
                                isOK = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return isOK;
    }

    //---------------------------------------
    private static boolean isPlace(String name) {
        for(String p : commonPlaceNameParts) {
            if(name.endsWith(p)) return true;
        }
        return false;
    }


    //--------------------------------------------------------------------------
    public static final int FUZZY_MATCH_THRESHOLD=85;

    private static void matchPartyNameBlockToRacParties(PartyName pnb, List<String> racParties){
        String matchedRacPtyName = null;
        if(racParties != null) {
            int ratioHigh = 0;
            for (String racPtyName : racParties) {
                int ratio = FuzzySearch.ratio(pnb.getText(), racPtyName);
                if (ratio == 100) { //If ratio gave a 100% match then look no further and break out
                    matchedRacPtyName = racPtyName;
                    break;
                } else { // else continue matching all rac parties and keeping track of the one with the
                    // highest score so far that is also over the match threshold
                    if (ratio >= FUZZY_MATCH_THRESHOLD && ratio > ratioHigh) {
                        ratioHigh = ratio;
                        matchedRacPtyName = racPtyName;
                    }
                }
            }
        }

        if(matchedRacPtyName != null) {
            pnb.setText(matchedRacPtyName);
        }
    }

    //------------------------------------------------------------
    private static final List<String> orgNameParts = Arrays.asList(
            "ASSEMBLY", "AUTHORITY", "LIMITED","LTD", "COUNCIL", "PLC", "BOARD", "TRUST", "AND CO", "AND SONS",
            "SOCIETY", "COMPANY", "BANK", "ASSOCIATION", "INSTITUTION", "CHURCH", "CORPORATION");

    //-------------------------------------
    private static boolean looksLikeOrgName(String name) {
        for (String onp : orgNameParts) {
            if (name.contains(onp)) return true;
        }
        return false;
    }

    //-----------------------------------------------------
    private static void setPersonNameParts(PartyName pn){

        String nameStr = pn.getText().replaceAll(" (?:OR|or) ", "||")
                .replaceAll(" +"," ")
                .toUpperCase().trim();


        String [] alt = nameStr.split("\\|\\|");

        String fullName = nameStr;
        if(alt.length > 1) {
            fullName = alt[0].trim();
            for(int i=1; i<alt.length; i++) {
                pn.getAltSurnames().add(alt[i].trim());
            }
        }

        String [] nps = fullName.split(" ");
        String forenames = nps[0];
        for(int i = 1; i < nps.length; i++) {
            if(nps[i] != "" && i < nps.length -1) {
                forenames += " " + nps[i];
            }
        }
        pn.setForenames(forenames);

        pn.setSurname(nps[nps.length-1]);
    }
}
