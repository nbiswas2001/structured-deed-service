package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

/**
 * A person. At the moment it has only the name attributes of a
 * person, but in the future can hold other details.
 */
@TypeAlias("uk.gov.ros.lr.deed.PersonName")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonName implements IEntity {

	//----------------------------------------------
	// Salutation e.g. Dr., Rev. etc.
    @Getter @Setter
	private String salutation;

	//----------------------------------------------
	// One or more names that appear before a surname.
    // E.g. THOMAS or SARA LEE.
    @Getter @Setter
	private String forenames;

	//----------------------------------------------
	// The surname. E.g. SMITH.
    @Getter @Setter
    private String surname;

	//----------------------------------------------
	// Text after name e.g. FRCP
    @Getter @Setter
    private String postNom;

	//----------------------------------------------
    @JsonIgnore
    public String getFullName() {
	    StringBuilder sb = new StringBuilder();
	    if(salutation!=null) sb.append(salutation).append(" ");
	    sb.append(forenames).append(" ").append(surname);
	    if(postNom!=null)sb.append(" ").append(postNom);
	    return sb.toString();
    }
}