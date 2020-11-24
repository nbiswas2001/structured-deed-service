package uk.gov.ros.lr.deed.structured.interpreter.preprocessors;


import uk.gov.ros.lr.deed.structured.model.parserdata.PartyBlock;
import uk.gov.ros.lr.deed.structured.model.parserdata.PartyName;
import uk.gov.ros.lr.deed.structured.interpreter.correctors.PartyBlockTextCorrector;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartyBlockPreProcessor {

    public static final int GOR = 0;
    public static final int GEE = 1;

    private static final Pattern[] endOfBlockRegex = new Pattern[2];

    static {
        endOfBlockRegex[GOR] = Pattern.compile("[~\\-] ?(?:TO|of) ?");
        endOfBlockRegex[GEE] = Pattern.compile("[~\\-] ?(?:of|\\[?over|containing) ?");
    }

     //--------------------------------------------------------------------------------------------------
    public static PartyBlock process (String partyBlockText, int blockType,
                                      List<String> racParties, List<PartyName> partyNames, int batchSeq){
        PartyBlock result = new PartyBlock();
        Matcher m = endOfBlockRegex[blockType].matcher(partyBlockText);
        boolean found = m.find();
        if(found) {
            result.setEndPos(m.end());
            String text = partyBlockText.substring(0, m.start()).trim();
            text = PartyBlockTextCorrector.correct(text);
            text = PartyNamePreProcessor.process(text,racParties, partyNames);

            result.setText(text);
            String restOfText = partyBlockText.substring(result.getEndPos(), partyBlockText.length()).trim();
            result.setRestOfText(restOfText);
        }
        else {
            result.setFaulty(true);
            String g = blockType == GOR? "grantor" : "grantee";
            result.setFault("End of "+g+" block not found");
        }

        return result;
    }

}
