package uk.gov.ros.lr.deed.structured.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import uk.gov.ros.lr.deed.structured.jobs.controllers.JobController;
import uk.gov.ros.lr.deed.structured.jobs.model.JobParams;


//The sole purpose of this component is to allow async execution of jobs
@Component
public class AsyncJobRunner {
    private JobController jobController;

    //---------------------------------------------
    @Autowired
    public AsyncJobRunner(JobController jobController){
        this.jobController = jobController;
    }

    @Async
    public void runJob(JobParams params){
        jobController.startJob(params);
    }


}
