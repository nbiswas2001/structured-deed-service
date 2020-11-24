package uk.gov.ros.lr.deed.structured.jobs.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import uk.gov.ros.lr.deed.structured.model.util.ToStringHelper;

public class JobParams {

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private String action;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private String batches;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private int startFromPage =-1;

    @Override
    public String toString() {
        return ToStringHelper.getString(this);
    }
}
