package uk.gov.ros.lr.deed.structured.interpreter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData.StructureLevelEnum;
import uk.gov.ros.lr.deed.structured.interpreter.AbridgementInterpreter;


@Component
public class DeedProcessor {

    private AbridgementInterpreter abridgementInterpreter;

    public static final int ALGORITHM_VERSION = 4;

    @Value("${parser.force-parse}")
    protected boolean forceParse;

    @Autowired
    public DeedProcessor(AbridgementInterpreter abridgementInterpreter){
        this.abridgementInterpreter = abridgementInterpreter;
    }

    //--------------------------------------------------------
    public void structureDeed(LrDeed deed){

        try {

            ParserData pd = deed.getParserData();

            boolean doParse = forceParse || pd == null || pd.getAlgorithmVersion() < ALGORITHM_VERSION;

            if (doParse) {

                deed.setParserData(null);
                deed.setStructuredContent(null);

                ParserData data = new ParserData();
                abridgementInterpreter.interpret(deed, data);

                data.setAlgorithmVersion(ALGORITHM_VERSION);

                deed.setParserData(data);

                if (data.getLevel() != StructureLevelEnum.raw) {
                    deed.setType(data.getDeedBlock().getDeedType());
                    deed.setCategory(data.getDeedBlock().getDeedCategory());
                }


                if (data.getLevel() == StructureLevelEnum.le) {
                    deed.setStructuredContent(data.getStructuredContent());
                }

            }
        }catch(Exception e){
            throw new RuntimeException("Failed to structure deed '"+deed.getReference()+"'", e);
        }
    }

    //--------------------------------
    public void processCustom(LrDeed deed){

        //Write your custom processing code here

        deed.setYear((int)(deed.getBatchSeq()/100));
    }

}
