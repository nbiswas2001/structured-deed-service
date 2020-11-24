package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;

import java.util.ArrayList;
import java.util.List;

/**
 * A type of LegalEntity that represents a group of two or more DesignatedParties.
 * Can be made up of a mixture of DesignatedPersons and Organisations.
 */
@TypeAlias("uk.gov.ros.lr.deed.LegalGroup")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegalGroup extends LegalEntity {

	//----------------------------------------------
	//Relationship between the parties in the group.
    // A common one is 'spouses'.
    @Getter @Setter
	private String relationship;

	//------------------------------------------------------------------
	//One of the most common LegalGroups is a couple living at the same address.
    // These are called 'jointly designated persons'. This flag indicates if this
    // is one such group. If yes, the address of both DesignatedParties in the group is the same.
    @Getter @Setter
	private Boolean isJDPersons;

	//----------------------------------------------
	//The share of rights for this group. Usually pro-indiviso. Non pro-indiviso has not been modelled yet. 
    @Getter @Setter
	private Shares shares;

	//--------------------------------------------------------------------
	// The destination for the right owned by this LE e.g. 'and survivors'
    @Getter @Setter
	private String destination;

	//----------------------------------------------
	//The legal entities that make up this group 
    @Getter @Setter
	private List<LegalEntity> legalEntities = null;
	public void addLegalEntity (LegalEntity legalEntity) {
        if(legalEntities == null) legalEntities = new ArrayList<>();
        legalEntities.add(legalEntity);
    }

	//----------------------------------------------
    @Override
    public String getDiscriminator() { return "legalGroup";}

	//----------------------------------------------
	@Override @Transient @JsonIgnore
	public List<DesignatedParty> getDesignatedParties() {
		List<DesignatedParty> result = new ArrayList<>();
		for(LegalEntity le: legalEntities) {
		    result.addAll(le.getDesignatedParties());
        }
        return result;
	}

}