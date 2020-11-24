package uk.gov.ros.lr.deed.structured.jobs.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Batch implements LongRunningWork{

    @Getter
    @JsonView(JobViews.Default.class)
    private int batchSeq;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    @JsonView(JobViews.Default.class)
    private LocalDateTime startTime;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    @JsonView(JobViews.Default.class)
    private LocalDateTime endTime;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private StatusEnum status;

    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonView(JobViews.Default.class)
    private Duration duration;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private long totalItems = -1;

    @JsonView(JobViews.Default.class)
    private AtomicLong itemsProcessed = new AtomicLong();
    public long getItemsProcessed() {
        return itemsProcessed.get();
    }

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private long itemsFailed;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private int lastPageProcessed = -1;

    @Getter @Setter
    @JsonView(JobViews.Default.class)
    private int totalPages;

    //----------------------------
    public Batch(int batchSeq) {
        this.batchSeq = batchSeq;
       status = StatusEnum.waiting;
    }
    //----------------------------
    public void incrementDeedsProcessed() {
        itemsProcessed.incrementAndGet();
    }
    public void incrementDeedsFailed() { itemsFailed++; }
}
