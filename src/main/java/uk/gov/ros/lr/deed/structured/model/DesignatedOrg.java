package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;

import java.util.Collections;
import java.util.List;

/**
 * A type of DesignatedParty.Represents an Organisation. 
 */
@TypeAlias("uk.gov.ros.lr.deed.DesignatedOrg")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DesignatedOrg extends DesignatedParty {

	
	//----------------------------------------------
	//The complete name of the Organition e.g. 'LLOYDS TSB PLC'
   @Getter
	private String name = null;
	public void setName ( String name ) {
		this.name = name ;
		setOrgTypeFromName(name);
	}

	//-------------------------------------------
	private void setOrgTypeFromName(String name){
		//set type
		if(name.endsWith("BUILDING SOCIETY")) this.type = TypeEnum.buildingSociety;
		else if(name.contains("BANK")) this.type = TypeEnum.bank;
		else if(name.endsWith("LIMITED")) this.type = TypeEnum.ltd;
		else if(name.endsWith("COUNCIL")) this.type = TypeEnum.council;
		else if(name.endsWith("TRUST")) this.type = TypeEnum.trust;
	}

	//----------------------------------------------------------
	//The designation of this Organisation. Can be any piece of
    // identifying text. Example 'Company number 132171 registered in Scotland'
    @Getter @Setter
	private String trade;

	//----------------------------------------------
	//Previous name of the organisation
    @Getter @Setter
	private String previousName;

	//----------------------------------------------
	//The type of the organisation 
    @Getter @Setter
	private TypeEnum type = TypeEnum.other;

	//----------------------------------------------
    //The discriminator for JSON mapping
	@Override
	public String getDiscriminator() { return "designatedOrg";}

	//----------------------------------------------
	@Override @Transient @JsonIgnore
    public List<DesignatedParty> getDesignatedParties() { return Collections.singletonList(this); }

	//-----------------------------
    @Override @Transient
    public String getFullName() { return name;}

    //==============================================
    // Types of designated organisations
	public enum TypeEnum {
		buildingSociety,
        bank,
        council,
		trust,
		ltd,
		other ;
	}
	

}