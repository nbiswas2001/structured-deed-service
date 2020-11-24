package uk.gov.ros.lr.deed.structured.jobs.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection="job")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Job implements LongRunningWork {

    @Id
    @Getter @Setter
    private String id;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    @JsonView(JobViews.Default.class)
    private LocalDateTime startTime;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    @JsonView(JobViews.Default.class)
    private LocalDateTime endTime;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonView(JobViews.Default.class)
    private Duration duration;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private JobParams params;

    @Getter @Setter
    @JsonView(JobViews.Detailed.class)
    private List<Batch> batches = new ArrayList<>();

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private long itemsProcessed;

    @JsonView(JobViews.Default.class)
    public long getTotalItems(){ return batches.size(); }

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private Batch currentBatch;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private StatusEnum status;

    //-----------------------------------
    public void incrementBatchesProcessed(){
        itemsProcessed++;
    }

    //------------------------------
    public Job(JobParams params) {
        this.params = params;
        this.status = StatusEnum.running;
        this.startTime = LocalDateTime.now();
    }
}
