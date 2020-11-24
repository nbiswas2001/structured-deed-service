package uk.gov.ros.lr.deed.structured.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

/**
 * This is essentially a key-value data structure that allows us to
 * flexibly add attributes to a deed. These attributes may or may not
 * be important. Examples: for a StdSecurity, there could be an
 * attribute "consideration" : "20,000 and further sums".
 */
@TypeAlias("uk.gov.ros.lr.deed.DeedAttribute")
public class DeedAttribute implements IEntity {

	
	//----------------------------------------------
	//PersonName of the deed attribute
    @Getter @Setter
	private NameEnum name;

	//----------------------------------------------
	//Value of the deed attribute 
    @Getter @Setter
	private String value;

	//------------------------------------------------
    // Ctor
    public DeedAttribute(NameEnum name, String value) {
        this.name = name;
        this.value = value;
    }

    //===============================================
    // Names of deed attributes
    public enum NameEnum {
		consideration,
		stdSecurityDate
    }
}