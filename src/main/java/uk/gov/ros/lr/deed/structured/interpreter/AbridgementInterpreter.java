package uk.gov.ros.lr.deed.structured.interpreter;

import org.springframework.stereotype.Component;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;
import uk.gov.ros.lr.deed.structured.model.parserdata.DeedBlock;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData;
import uk.gov.ros.lr.deed.structured.model.parserdata.PartyBlock;
import uk.gov.ros.lr.deed.structured.interpreter.correctors.AbridgementTextCorrector;
import uk.gov.ros.lr.deed.structured.interpreter.lexers.Seg1ParseController;
import uk.gov.ros.lr.deed.structured.interpreter.preprocessors.DeedBlockPreProcessor;
import uk.gov.ros.lr.deed.structured.interpreter.preprocessors.PartyBlockPreProcessor;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData.StructureLevelEnum;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData.ParseErrorEnum;

import java.util.Arrays;
import java.util.List;

@Component
public class AbridgementInterpreter {


    //-------------------------------------------------------
    private static final List<String> parseableDeeds = Arrays.asList("disp","feuDisp","blDisp","stdSec", "disch");

    public void interpret(LrDeed deed, ParserData data) {

        int batchSeq = deed.getBatchSeq();

        try {

            data.setAbridgement(deed.getRacAbridgement());

            //User corrected entry text if available, else use original entry text
            String text = data.getAbridgement().getCorrectedEntryText()==null?
                            data.getAbridgement().getEntryText()
                            : data.getAbridgement().getCorrectedEntryText();

            data.setLevel(StructureLevelEnum.raw);
            data.setError(ParseErrorEnum.na);

            if(!text.isEmpty()) {

                //make corrections
                String cleanedText = AbridgementTextCorrector.correct(text, batchSeq);

                //Preprocess grantor block. Also identifies deed type
                DeedBlock deedBlock = DeedBlockPreProcessor.process(cleanedText);
                if (!deedBlock.isFaulty()) {
                    data.setDeedBlock(deedBlock);
                    data.setLevel(StructureLevelEnum.basic);
                }

                //Check if parse should be attempted
                if (data.getLevel() == StructureLevelEnum.basic) {
                    if (parseableDeeds.contains(deedBlock.getDeedType())) data.setLevel(StructureLevelEnum.parseable);
                    else data.setLevel(StructureLevelEnum.ignored);
                }


                //If all Ok then proceed to pre process segment 1 (parties)
                if (data.getLevel() == StructureLevelEnum.parseable) {

                    data.setError(ParseErrorEnum.none);

                    //Preprocess grantor block
                    PartyBlock gorBlock = null;
                    gorBlock = PartyBlockPreProcessor.process(
                            deedBlock.getRestOfText(),
                            PartyBlockPreProcessor.GOR,
                            data.getAbridgement().getParties(),
                            data.getPartyNames(),
                            batchSeq);

                    if (gorBlock == null || gorBlock.isFaulty()) data.setError(ParseErrorEnum.incomplete);

                    gorBlock.setStartPos(deedBlock.getEndPos() + 1);


                    //Preprocess grantee block
                    PartyBlock geeBlock = null;
                    if (data.getError() == ParseErrorEnum.none) {
                        geeBlock = PartyBlockPreProcessor.process(
                                gorBlock.getRestOfText(),
                                PartyBlockPreProcessor.GEE,
                                data.getAbridgement().getParties(),
                                data.getPartyNames(),
                                batchSeq);
                    } else data.setError(ParseErrorEnum.incomplete);

                    if (geeBlock == null || geeBlock.isFaulty()) data.setError(ParseErrorEnum.incomplete);

                    //Attempt full parse
                    if (data.getError() == ParseErrorEnum.none) {

                        StringBuilder sb = new StringBuilder();
                        sb.append(deedBlock.getText())
                                .append(" ~BY ")
                                .append(gorBlock.getText())
                                .append(" ~TO ")
                                .append(geeBlock.getText());
                        String tokenisedText = sb.toString();
                        data.setTokenisedSeg1Text(tokenisedText);

                        StructuredContent sc = Seg1ParseController.parse(tokenisedText, data);

                        if (data.getError() == ParseErrorEnum.none) data.setLevel(StructureLevelEnum.le);

                        data.setStructuredContent(sc);

                    }
                }
            }
        }
        catch (Exception e){
            throw new RuntimeException("Failed to parse deed "+deed, e);
        }
    }

}
