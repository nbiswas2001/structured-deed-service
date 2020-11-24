package uk.gov.ros.lr.deed.structured.interpreter.correctors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeedTextCorrector {

    //-----------------------------------------------
    private static final Pattern numberRegex = Pattern.compile("\\$?[Il!,0-9OoQ\\.]+"); //£ -> $
    private static final Pattern numberTestRegex = Pattern.compile("[0-9]+");
    private static final Pattern badNumberCharsRegex = Pattern.compile("[Il!,Oo]");
    private static final Pattern numberWithDotForCommaRegex = Pattern.compile("\\$ ?[0-9]+\\.[0-9][0-9][0-9]");

    //----------------------------------------------------
    public static String correctCommonOcrErrorsInDeedTypeWord(String text){

        String result = text
                .replaceAll("[\\.,]", "")
                .replace("1", "I")
                .replace("3", "E")
                .replace("5", "S")
                .replace("8", "B")
                .replace("0", "O")
                .replace(")", "D");

        return  result;
    }

    //-----------------------------------------------------
    public static String correctStdSecAmountValue(String text){

        //Correct bad numbers
        //Replace I,l,! for 1s and O,o for 0s. Also remove separator commas and dots
        Matcher m = numberRegex.matcher(text);

        while(m.find()) {
            String probableNum = text.substring(m.start(), m.end());

            if (probableNum.length() > 3 ) {
                Matcher m2 = numberTestRegex.matcher(probableNum);
                if(m2.find()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(text.substring(0, m.start()));

                    String num = m.group();
                    //correct ocr errors
                    Matcher bm = badNumberCharsRegex.matcher(num);
                    if (bm.find()) {
                        num = m.group()
                                .replaceAll("[OQo]", "0")
                                .replaceAll("[Il!]", "1")
                                .replaceAll("[,]", "");
                    }

                    //correct dot for comma
                    String num1 = "";
                    String num2 = "";
                    Matcher dm = numberWithDotForCommaRegex.matcher(num);
                    if (dm.find()) {
                        num1 = dm.group();
                        num2 = num.substring(dm.end(), num.length());
                        num1 = num1.replace(".", "");
                        num = num1 + num2;

                    }
                    if (num.endsWith(".")) num = num.substring(0, num.length() - 1); //strip trailing .
                    sb.append(num).append(' ');

                    String endPart = text.substring(m.end(), text.length());
                    //remove randon '.'s due to ocr error
                    endPart = endPart.replace(".", " ");
                    sb.append(endPart);
                    text = sb.toString();
                    break;
                }
            }
        }
        return text;
    }

}
