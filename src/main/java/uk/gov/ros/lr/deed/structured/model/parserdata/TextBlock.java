package uk.gov.ros.lr.deed.structured.model.parserdata;

import lombok.Getter;
import lombok.Setter;

public abstract class TextBlock {

    @Getter @Setter
    protected String text;

    @Getter @Setter
    protected int startPos;

    @Getter @Setter
    protected int endPos;

    abstract public String getToken();

    @Getter @Setter
    protected String restOfText;

    @Getter @Setter
    protected boolean faulty;

    @Getter @Setter
    protected String fault;
}
