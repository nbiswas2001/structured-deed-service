package uk.gov.ros.lr.deed.structured.interpreter.lexers.structs;

import uk.gov.ros.lr.deed.structured.model.IEntity;
import uk.gov.ros.lr.deed.structured.model.LegalEntity;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;

public class LegalGroupOrLegalRepRef implements IEntity {

    private LegalEntity legalEntity;
    public LegalEntity getLegalEntity() { return legalEntity;}

    //----------------------------------------------
    public void resolve(StructuredContent structContent) {
        legalEntity =  structContent.getGrantor();
    }
}
