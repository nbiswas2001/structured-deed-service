package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import uk.gov.ros.lr.deed.structured.model.util.ToStringHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * A type of DesignatedParty. Represents person with additional
 * identifying details such as address, profession, former names etc.
 */
@TypeAlias("uk.gov.ros.lr.deed.DesignatedPerson")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DesignatedPerson extends DesignatedParty {

	
	//----------------------------------------------
	//The current profession of the person, if present
    @Getter @Setter
	private String profession;

	//----------------------------------------------
	//The person who is being designated 
    @Getter @Setter
	private PersonName name;

	//----------------------------------------------
	//The previous name (and other details) of this DesignatedPerson 
    @Getter @Setter
	private PersonName previousName;

	//----------------------------------------------
	//The aliases of this DesignatedPerson
    @Getter @Setter
	private List<PersonName> aliases = new ArrayList<>();
	public void addAlias (PersonName alias) { this.aliases.add(alias); }

	//----------------------------------------------
	@Override
    public String getDiscriminator() { return "designatedPerson";}

	//----------------------------------------------
	@Override @Transient
	public String getFullName() { return name.getFullName(); }

	//----------------------------------------------
	@Override @Transient @JsonIgnore
	public List<DesignatedParty> getDesignatedParties() {
		List<DesignatedParty> result = new ArrayList<>();
		result.add(this);
		return result;
    }

	//-----------------------------
	@Override
	public String toString() {
		return ToStringHelper.getString(this);
	}
}