package uk.gov.ros.lr.deed.structured.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

/**
 * The block representing the subjects of this deed. 
 */
@TypeAlias("uk.gov.ros.lr.deed.Subjects")
public class Subjects implements IEntity {

	
	//----------------------------------------------
	// The unparsed block of text from the deed abridgement
    //  corresponding to the complete set of Subjects
	@Getter @Setter
	private String textBlock = null;

	
}