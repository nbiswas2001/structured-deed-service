package uk.gov.ros.lr.deed.structured.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

/**
 * Sometimes (in a Disposition deed) the LegalGroup may represent a group
 * pf parties sharing ownership of the Subject. In this case this entity represents
 * the shares of each party in the LegalGroup over the Subject.  Where shareType is
 * individual, the share attribute is also populated.
 */
@TypeAlias("uk.gov.ros.lr.deed.Shares")
public class Shares implements IEntity {

    //---------------------------
    //Text describing the share
    @Getter @Setter
	private String text;

    //----------------------------------------------
    //The type of shares. 'pro-indiviso' means joint ownership,
    // while 'individual' means each party has a specific
    // proportion of the ownership.
    @Getter @Setter
    private ShareTypeEnum shareType;

    //----------------------------------------------
    //Where shareType  is 'individual' this field provides the
    // proportional breakdown across the parties in the group.
    // The format for this has not been determined yet.
    @Getter @Setter
    private String shareProportions = null;

    //---------------------------
	public Shares(String text) {
		this.text = text;
	}

	//==============================================
	public enum ShareTypeEnum {
		proIndiviso, individual ;
	}
	
}