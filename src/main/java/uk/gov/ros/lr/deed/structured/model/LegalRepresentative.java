package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A type of LegalEntity that represents a legal representative.
 * Here one party (the agent) represents another (the principal)
 */
@TypeAlias("uk.gov.ros.lr.deed.LegalRepresentative")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegalRepresentative extends LegalEntity {

	
	//----------------------------------------------
	//Type of the LegalRepresentative
    @Getter @Setter
	private TypeEnum type;

	//----------------------------------------------
	//The representor legal entity 
    @Getter @Setter
	private LegalEntity agent;

	//----------------------------------------------
	//The representee legal entity 
    @Getter @Setter
	private LegalEntity principal;

	//----------------------------------------------
    public String getDiscriminator() { return "legalRepresentative";}

	//----------------------------------------------
	@Transient @JsonIgnore
	public List<DesignatedParty> getDesignatedParties() {
		List<DesignatedParty> result = new ArrayList<>();
		List<LegalEntity> leList = Arrays.asList(agent, principal);
		for(LegalEntity le : leList) {
		    if(le != null)result.addAll(le.getDesignatedParties());
        }
		return result;
	}


	//==============================================
	public enum TypeEnum {
		trustee,
		executor,
		trusteeExecutor,
		curatorBonis,
		representative;
	}


}