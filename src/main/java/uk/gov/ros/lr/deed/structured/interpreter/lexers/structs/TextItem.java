package uk.gov.ros.lr.deed.structured.interpreter.lexers.structs;

import uk.gov.ros.lr.deed.structured.model.IEntity;

public class TextItem implements IEntity {

    private String name;
    private String value;

    public TextItem(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String get() {
        return this.value;
    }
    public Integer getInt() {
        return this.value == null? null : Integer.parseInt(get());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextItem:{ name: ").append(name).append(", value: ").append(value).append("}");
        return sb.toString();
    }
}
