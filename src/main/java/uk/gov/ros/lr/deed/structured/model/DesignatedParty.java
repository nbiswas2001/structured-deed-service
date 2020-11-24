package uk.gov.ros.lr.deed.structured.model;

import lombok.Getter;
import lombok.Setter;

/**
 * A single party i.e. a Person or Organisation that has been designated i.e.
 * uniquely identified through addditional details (such as current address
 * for a person) for the purpose of being included in a legal document.
 */
abstract public class DesignatedParty extends LegalEntity {

    //-----------------------------------------------------
    //Lets the sub class construct the full name from parts
    public abstract String getFullName();

    //----------------------------------------------
    //Current address of this DesignatedPerson
    @Getter @Setter
    protected Address address = null;

    //----------------------------------------------
    //Previous address of this DesignatedPerson
    @Getter @Setter
    protected Address previousAddress = null;

    //---------------------------------------------
    // The destination for the right owned by this
    // LE e.g. 'and survivors'
    @Getter @Setter
    private String destination;

}