package uk.gov.ros.lr.deed.structured.interpreter.lexers.structs;

import uk.gov.ros.lr.deed.structured.model.IEntity;
import uk.gov.ros.lr.deed.structured.model.PersonName;

import java.util.ArrayList;
import java.util.List;

public class PersonNameSet implements IEntity {
    public PersonName name;
    public List<PersonName> aliases = new ArrayList<>();
}
