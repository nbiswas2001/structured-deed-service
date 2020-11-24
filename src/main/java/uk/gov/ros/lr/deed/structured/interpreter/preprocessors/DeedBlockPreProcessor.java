package uk.gov.ros.lr.deed.structured.interpreter.preprocessors;

import uk.gov.ros.lr.deed.structured.model.parserdata.DeedBlock;
import uk.gov.ros.lr.deed.structured.interpreter.classifiers.DeedTypeClassifier;
import uk.gov.ros.lr.deed.structured.interpreter.correctors.DeedTextCorrector;
import uk.gov.ros.lr.deed.structured.interpreter.util.CorpusLoader;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DeedBlockPreProcessor {

    private static Set<Pattern> stopWords;

    private static final Pattern deedNameRegex = Pattern.compile("\\b[A-Z .0-8()]+\\b");


    //-----------------------------------------------------------------
    static {

        stopWords = CorpusLoader.load("stop-words.txt").stream()
                .map(sw -> Pattern.compile(sw)).collect(Collectors.toSet());
    }

    //--------------------------------------------------------------------------------
    private static final Pattern endOfDeedBlkRegex = Pattern.compile("[ ,)](by ?)[A-Z1(]");


    //-------------------------------------------------------------------
    public static DeedBlock process(String abridgementTxt) {

        String deedTypeStr = "";

        //find the stopword that is closest to the start of the text
        int deedTypeNameEndPos = abridgementTxt.length()-1;
        for(Pattern sw : stopWords){
            Matcher swM = sw.matcher(abridgementTxt);
            if(swM.find() && swM.start() > 3) {
                if(swM.start() < deedTypeNameEndPos) deedTypeNameEndPos = swM.start();
            }
        }

        //the deed type text is from start upto the stop word
        deedTypeStr = abridgementTxt.substring(0, deedTypeNameEndPos).toUpperCase();

        Matcher m1 = deedNameRegex.matcher(deedTypeStr);
        if(m1.find()) {
            deedTypeStr = deedTypeStr.substring(m1.start(), m1.end());
        }

        DeedBlock result = new DeedBlock();
        //result.setText(deedTypeStr);
        result.setStartPos(0);
        //result.setEndPos(deedTypeNameEndPos);

        String deedType = DeedTypeClassifier.classify(deedTypeStr);
        result.setDeedType(deedType);
        result.setDeedCategory(DeedTypeClassifier.getCategoryCodeForType(deedType));

        if(deedTypeNameEndPos != -1) {

            //Find the endPos of the deed block
            int deedBlockEndPos = 0;   //end position of the full deed block
            int deedDetailsEndPos = 0;
            String seg1Txt = "";
            String deedDetailsTxt = "";

            Matcher m2 = endOfDeedBlkRegex.matcher(abridgementTxt);
            if(m2.find()) {
                deedDetailsEndPos = m2.start(1);
                deedBlockEndPos = m2.end(1);
                seg1Txt = abridgementTxt.substring(0, deedBlockEndPos);
            }
            if(seg1Txt != "") {
                //Extra details about the deed e.g. consideration amount etc.
                if(deedDetailsEndPos >= deedTypeNameEndPos) {
                    deedDetailsTxt = abridgementTxt.substring(deedTypeNameEndPos, deedDetailsEndPos).trim();
                    deedDetailsTxt = DeedTextCorrector.correctStdSecAmountValue(deedDetailsTxt);
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result.getToken()).append(" ").append(deedDetailsTxt);
            result.setText(sb.toString());

            String restOfText = abridgementTxt.substring(deedBlockEndPos, abridgementTxt.length()).trim();
            result.setRestOfText(restOfText);
        }
        else {
            result.setFaulty(true);
            result.setFault("Could not detect end of deed block");
        }

        if(result.getRestOfText().length() == 0){ //some text must be present
            result.setFaulty(true);
            result.setFault("Rest of text is not present");
        }

        return result;
    }


}
