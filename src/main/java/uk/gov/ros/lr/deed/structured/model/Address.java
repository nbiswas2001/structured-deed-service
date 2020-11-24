package uk.gov.ros.lr.deed.structured.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import java.util.ArrayList;
import java.util.List;

/**
 * An address. May or may not be complete. 
 */
@TypeAlias("uk.gov.ros.lr.deed.Address")
public class Address implements IEntity{

	
	//----------------------------------------------
	//A set of address lines
	@Getter @Setter
	private List<String> lines = null;
	public void addLine(String line) {
		if(lines == null) lines = new ArrayList<>();
		lines.add(line);
	}
	

}