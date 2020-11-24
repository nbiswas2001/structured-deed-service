package uk.gov.ros.lr.deed.structured.interpreter.lexers.structs;

import uk.gov.ros.lr.deed.structured.model.*;

import java.util.ArrayList;
import java.util.List;

public class JDPersons implements IEntity {
    //----------------------------
    public Address jointAddress;
    public Address jointPrevAddress;
    public String relation;
    public Shares shares;
    public List<DesignatedPerson> desigPersons = new ArrayList<>();
    public List<DesignatedPartyRef> desigPersonRefs = new ArrayList<>();

    //------------------------------------------------
    public LegalGroup createLegalGroup() {
        LegalGroup legalGroup = new LegalGroup();
        legalGroup.setIsJDPersons(true);
        legalGroup.setRelationship(relation);
        legalGroup.setShares(shares);

        //load DP refs
        for(DesignatedPartyRef pRef : desigPersonRefs)  {
            DesignatedParty actualDP = pRef.getDesignatedParty();
            if(jointAddress==null) jointAddress = actualDP.getAddress();
            legalGroup.addLegalEntity(actualDP);
        }

        //load DPs
        for(DesignatedPerson dp : desigPersons)  {
            dp.setAddress(jointAddress);
            dp.setPreviousAddress(jointPrevAddress);
            legalGroup.addLegalEntity(dp);
        }

        return legalGroup;
    }
}
