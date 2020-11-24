package uk.gov.ros.lr.deed.structured.interpreter.correctors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartyBlockTextCorrector {

    //-------------------------------------------------
    public static String correct(String text) {

        text = correctJoinedtext(text);

        //remove unneccessary text
        text = text
                .replace("GOVERNOR AND COMPANY OF", "")
                .replace("GOVERNORS OF", "")
                .replace("MAGISTRATES AND COUNCILLORS OF ROYAL BURGH OF", "TOWN COUNCIL OF");


        //correct common misspellings and normalise
        text = text
                .replaceAll(" P L C", " PLC")
                .replaceAll("T S B", "TSB")
                .replaceAll(" LIMITED", " LTD");


        return text;
    }


    //-------------------------------------------------------------
    private static final Pattern orRegex = Pattern.compile("( +|[A-Z]{2})or( +|[A-Z]{2})");
    private static final Pattern andRegex = Pattern.compile("( +|[A-Z]{2})and( +|[A-Z]{2})");

    private static String correctJoinedtext(String text){
        //correct 'or'. Change 'or', '...XYZor ', ' orXYZ...' to ' OR '
        Matcher orM = orRegex.matcher(text);
        if(orM.find()){
            text = orM.replaceAll("$1 OR $2").replace("  "," ");
        }

        //correct 'and'. Change '...XYZand ', ' andXYZ...' to ' and '
        Matcher andM = andRegex.matcher(text);
        if(andM.find()){
            text = andM.replaceAll("$1 and $2").replace("  "," ");
        }
        return text.trim();
    }

}
