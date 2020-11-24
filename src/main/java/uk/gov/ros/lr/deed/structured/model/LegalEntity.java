package uk.gov.ros.lr.deed.structured.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * An abstract entity that can play a legal role (such as grantor, grantee,
 * proprietor etc.) in a legal document such as a deed or title. It may be
 * composed of one or more individuals or organisations with additional
 * details such as their address etc.
 */

public abstract class LegalEntity implements IEntity {

	//----------------------------------------------
	//The discriminator for this abstract class
    abstract public String getDiscriminator ();

    //--------------------------------------------------------------------
    // The DesignatedParties in this LegalEntity
    abstract public List<DesignatedParty> getDesignatedParties();

}