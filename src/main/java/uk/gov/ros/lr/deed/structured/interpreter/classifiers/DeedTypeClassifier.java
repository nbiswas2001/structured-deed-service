package uk.gov.ros.lr.deed.structured.interpreter.classifiers;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import uk.gov.ros.lr.deed.structured.interpreter.correctors.DeedTextCorrector;
import uk.gov.ros.lr.deed.structured.interpreter.util.CorpusLoader;
import uk.gov.ros.lr.deed.structured.model.LrDeed.CategoryEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DeedTypeClassifier {

    private static Set<String> keywords;
    private static Map<String, String> deedTypes = new HashMap<>();
    private static Map<String, String> matchedDtTexts = new HashMap<>();

    private static final int FUZZY_THRESHOLD = 75;

    //------------------------------------------------------
    static {
        keywords = CorpusLoader.load("deed-type-keywords.txt");

        for(String l : CorpusLoader.load("deed-types.txt")){
            String[] sArr1 = l.split("->");

            String[] sArr2 = sArr1[0].trim().split(",");
            String deedType = sArr2[0].trim();
            String deedCat = sArr2[1].trim();

            deedTypes.put(deedType, deedCat);

            String[] sArr3 = sArr1[1].split(",");
            for(String s : sArr3) {
                matchedDtTexts.put(s.trim(), deedType);
            }

        }
    }
    //-------------------------------------------------------------------
    public static String classify(String deedTypeText){

        //String deedTypeText = deedTypeBlock.getText();
        StringBuilder sb = new StringBuilder();
        int unmatchedWords = 0;

        Scanner s = new Scanner(deedTypeText).useDelimiter(" ");
        while(s.hasNext()) {
            String word = s.next();

            if(! word.equals("OF")) {  //ignore OF
                int lnth = word.length();
                if (lnth > 1) {

                    //correct word
                    word = DeedTextCorrector.correctCommonOcrErrorsInDeedTypeWord(word);

                    int maxRatio = 0;
                    String matchedKW = "";
                    for (String kw : keywords) {
                        int ratio = FuzzySearch.ratio(word, kw);

                        //HACK for short keywords
                        if (lnth < 5 && kw.length() == lnth) ratio += 25;

                        if (ratio > maxRatio && ratio >= FUZZY_THRESHOLD) {
                            maxRatio = ratio;
                            matchedKW = kw;
                        }
                    }
                    if (maxRatio > 0) sb.append(matchedKW).append(" ");
                    else unmatchedWords++;
                }
            }
        }

        String matchedDtTxt = "";
        if(unmatchedWords > 1 || sb.length()==0) matchedDtTxt = "$XXX"; //allow only 1 unmatched word
        else matchedDtTxt = sb.toString().trim();

        //Everything that starts with NOTICE but is not a Notice of Title is classed as 'Notice'
        if(matchedDtTxt.startsWith("NOTICE") && !matchedDtTxt.contains(" TITLE")) deedTypeText = "$NOTICE*";

        String dt = matchedDtTexts.containsKey(matchedDtTxt)? matchedDtTexts.get(matchedDtTxt): "misc";

        return dt;
    }

    //----------------------------------------------
    public static CategoryEnum getCategoryCodeForType(String dt){
        CategoryEnum deedCat = null;
        if(deedTypes.containsKey(dt)){
            String catStr = deedTypes.get(dt);
            switch (catStr) {
                case "ST": deedCat = CategoryEnum.saleTfr; break;
                case "L": deedCat = CategoryEnum.lease; break;
                case "M": deedCat = CategoryEnum.mortgage; break;
                case "RB": deedCat = CategoryEnum.rightsBurdens; break;
                case "O": deedCat = CategoryEnum.other; break;
                case "X": deedCat = CategoryEnum.unresolved; break;
            }

        }
        else throw new RuntimeException("Unknown deed type '"+dt+"'");
        return deedCat;
    }


}
