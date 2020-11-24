package uk.gov.ros.lr.deed.structured.interpreter.correctors;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbridgementTextCorrector {

    //-----------------------------------------
    private static final Pattern badCharsRegex = Pattern.compile("[<>\"#*+:?@_^`|\\\\]");

    // even_no county | county odd_no
    private static final Pattern pageNumRegex = Pattern.compile("\\b(?:[1-9][0-9][0-9]?[02468] (?:ABERDEEN|ANGUS|ARGYLL|AYR|BANFF|BERWICK|BUTE|CAITHNESS|CLACKMANNAN|DUMBARTON|DUMFRIES|EAST LOTHIAN|FIFE|GLASGOW|INVERNESS|KINCARDINE|KINROSS|KIRKCUDBRIGHT|LANARK|MIDLOTHIAN|MORAY|NAIRN|ORKNEY & ZETLAND|PEEBLES|PERTH|RENFREW|ROSS AND CROMARTY|ROXBURGH|SELKIRK|STIRLING|SUTHERLAND|WEST LOTHIAN|WIGTOWN))|(?:(?:ABERDEEN|ANGUS|ARGYLL|AYR|BANFF|BERWICK|BUTE|CAITHNESS|CLACKMANNAN|DUMBARTON|DUMFRIES|EAST LOTHIAN|FIFE|GLASGOW|INVERNESS|KINCARDINE|KINROSS|KIRKCUDBRIGHT|LANARK|MIDLOTHIAN|MORAY|NAIRN|ORKNEY & ZETLAND|PEEBLES|PERTH|RENFREW|ROSS AND CROMARTY|ROXBURGH|SELKIRK|STIRLING|SUTHERLAND|WEST LOTHIAN|WIGTOWN) [1-9][0-9][0-9]?[13579])\\b");

    //words with 's
    private static final Pattern aposSRegex = Pattern.compile("'[Ss]");


    //-----------------------------------------
    //General corrections in text
    public static String correct(String text, int batchSeq){

        //remove control chars in later deeds
        if (batchSeq > 199000) {
            text = stripControlChars(text);
        }

        //Strip bad chars
        Matcher m = badCharsRegex.matcher(text);
        text = m.replaceAll("");

        //Strip page numbers
        Matcher pnM = pageNumRegex.matcher(text);
        text = pnM.replaceAll("");

        //Random chars
        if(text.contains("-")) {
            text = text.replace("--", "-");
            text = text.replace("~-", "~");
        }

        text = escapeApostrophe(text);

        text = removeUnnecessaryPhrases(text);

        return text;
    }
    //----------------------------------------
    private static final Pattern ctrlCharsRegex = Pattern.compile("\\?[aAnzpql]");

    public static String stripControlChars(String text) {
        Matcher m = ctrlCharsRegex.matcher(text);
        String result = m.replaceAll("");
        return  result;
    }

    //------------------------------------------------------------
    private static String escapeApostrophe(String text){
        // Replace all ' with blanks (except where the word ends with 's)
        if(text.contains("'")) {
            Matcher as = aposSRegex.matcher(text);
            boolean hasAposS = as.find();

            if(hasAposS) {
                text = text.replace("'s","#s");
                text = text.replace("'S","#S");
            }
            text = text.replace("'", " ");
            if(hasAposS) {
                text = text.replace("#s", "'s");
                text = text.replace("#S", "'S");
            }
        }

        return text;
    }


    //-------------------------------------------------------------
    private static String removeUnnecessaryPhrases(String text) {
        if(text.length() > 0) {
            text = removeWarrantText(text);
            text = removeDeedClauses(text);
        }
        return text;
    }
    //------------------------------------------------------------------------
    private static final Pattern warrantTextStartRegex
            = Pattern.compile("[;,~ ]+ with (?:(?:two|3|[Tt]hree|4|[Ff]our|5|[Ff]ive|6|[Ss]ix|7|[Ss]even|8|[Ee]ight|9|[Nn]ine) )?Warrants?[ ,]");
    private static String removeWarrantText(String block){
        String result = block;
        Matcher m = warrantTextStartRegex.matcher(block);
        if(m.find()) {
            result = block.substring(0,  m.start());
        }
        return result;
    }

    //---------------------------------------------------------------------
    private static final List<Pattern> deedClauses = Arrays.asList(
            Pattern.compile("\\([ ]?to[ ]+effect[ ]+of[ ]+disburdening [A-Za-z0-9 ,.$]+by said (?:Granter|Company)\\)"),
            Pattern.compile("\\([ ]?in[ ]+respect[ ]+of[ ]+discount[ ]?\\)"),
            Pattern.compile("\\([ ]?containing[ ]+Clause[ ]+of[ ]+Resig\\.[ ]+ad[ ]+rem\\.[ ]?\\)")
    );

    private static String removeDeedClauses(String text) {
        for(Pattern dc : deedClauses) {
            Matcher m = dc.matcher(text);
            if(m.find()) {
                text = m.replaceAll("");
                break;
            }
        }
        return text;
    }
}
