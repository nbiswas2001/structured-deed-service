package uk.gov.ros.lr.deed.structured.jobs.model;

import java.time.Duration;
import java.time.LocalDateTime;

public interface LongRunningWork {

    LocalDateTime getStartTime();
    void setStartTime(LocalDateTime time);

    LocalDateTime getEndTime();
    void setEndTime(LocalDateTime time);

    Duration getDuration();
    void setDuration(Duration duration);

    StatusEnum getStatus();
    void setStatus(StatusEnum status);

    //--------------------------------------------------
    default void updateDuration(LocalDateTime durationCheckpoint){
        Duration oldDur = getDuration();
        Duration newDur = Duration.between(durationCheckpoint, LocalDateTime.now());
        Duration d = oldDur != null ? oldDur.plus(newDur) : newDur;
        setDuration(d);
    }

    //==========================
    public enum StatusEnum {
        waiting,
        running,
        completed,
        paused,
        killed
    }
}
