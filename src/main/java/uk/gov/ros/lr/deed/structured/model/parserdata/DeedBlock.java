package uk.gov.ros.lr.deed.structured.model.parserdata;

import lombok.Getter;
import lombok.Setter;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;

public class DeedBlock extends TextBlock {

    @Getter @Setter
    private String deedType;

    @Getter @Setter
    private LrDeed.CategoryEnum deedCategory;

    @Override
    public String getToken() {
        return deedType.toUpperCase();
    }
}
