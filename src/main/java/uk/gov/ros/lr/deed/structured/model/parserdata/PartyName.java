package uk.gov.ros.lr.deed.structured.model.parserdata;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class PartyName extends TextBlock {

    @Getter @Setter
    private int index;

    @Getter @Setter
    private boolean isOrg;

    @Getter @Setter
    private String forenames;

    @Getter @Setter
    private String surname;

    @Getter @Setter
    private List<String> altSurnames = new ArrayList<>();

    @Getter @Setter
    private boolean isUsed;

    @Override
    public String getToken() {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(isOrg ? "ORG" : "PERSON").append("-").append(index).append("}");
        return sb.toString();
    }
}
