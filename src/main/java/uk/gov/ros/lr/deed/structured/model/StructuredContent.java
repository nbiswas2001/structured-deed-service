package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import uk.gov.ros.lr.deed.structured.model.util.ToStringHelper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The information about a LR Deed that has been captured
 * in a structured form. This could be by automatic parsing
 * of data such as deed abridgements, or by human operatrs
 */
@TypeAlias("uk.gov.ros.lr.deed.StructuredContent")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StructuredContent implements IEntity {

    //----------------------------------------------
	//The creation timestamp of this Structure
	@Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
	private LocalDateTime createTime;

    //----------------------------------------------
	//If this Structure has been manually validated
    @Getter @Setter
	private Boolean isValidated = null;

    //----------------------------------------------
	//The dates on which the deed was signed by the legal entities. 
    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private List<LocalDate> signingDates;

	//----------------------------------------------
	//The legal entity that is the grantor of this Deed (one giving the rights) 
    @Getter @Setter
	private LegalEntity grantor;

	//----------------------------------------------
	// Additional attributes of this deed. For example a
    //  Standard Security name have an attribute called 'consideration'.
    @Getter @Setter
    private List<DeedAttribute> attributes;
	public void addAttribute(DeedAttribute attribute){
		if(attributes == null) attributes = new ArrayList<>();
		attributes.add(attribute);
	}

	//----------------------------------------------
	//The legal entity that is the grantee of this deed (one receiving rights)
    @Getter @Setter
    private LegalEntity grantee;

	//----------------------------------------------
	// The subjects block of this deed. Contains a set of
    //  subjects, where each subject is a land or property
    @Getter @Setter
	private Subjects subjects;

	//----------------------------------------------
	//The legal entity giving consent to this transaction
    @Getter @Setter
    private LegalEntity consenter;

	//----------------------------------------------
    // Ctor
    public StructuredContent(LocalDateTime createTime,
                             Boolean isValidated) {
        this.createTime = createTime;
        this.isValidated = isValidated;
    }

	//-------------------------
	@Override
	public String toString() {
		return ToStringHelper.getString(this, false);
	}


}