package uk.gov.ros.lr.deed.structured.endpoints;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.gov.ros.lr.deed.structured.jobs.model.Job;
import uk.gov.ros.lr.deed.structured.jobs.controllers.JobController;
import uk.gov.ros.lr.deed.structured.jobs.model.JobParams;
import uk.gov.ros.lr.deed.structured.jobs.model.JobViews;
import uk.gov.ros.lr.deed.structured.jobs.model.LongRunningWork;

import java.util.Arrays;
import java.util.List;

@RestController
public class JobEndPoint {

    private JobController jobController;
    private AsyncJobRunner asyncJobRunner;

    //---------------------------------------------
    @Autowired
    public JobEndPoint(JobController jobController,
                       AsyncJobRunner asyncJobRunner){
        this.jobController = jobController;
        this.asyncJobRunner = asyncJobRunner;
    }


    //-------------------------------------------------
    private static final List<String> actions = Arrays.asList("interpret","custom");

    //-------------------------------------------------
    @PostMapping("/job/start")
    public ResponseEntity startJob(@RequestBody JobParams params){

        ResponseEntity resp = null;

        if(jobController.getCurrentJob()==null) {
            if(actions.contains(params.getAction())) { //check if valid action
                asyncJobRunner.runJob(params);
                resp = ResponseEntity.status(HttpStatus.OK).body("Job start requested");
            }
            else resp = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("'"+params.getAction()+"' is not a valid action");
        }
        else resp = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Job is already running");
        return resp;
    }

    //-------------------------------------------------
    @PostMapping("/job/kill")
    public ResponseEntity killJob(){

        ResponseEntity resp = null;
        if(jobController.getCurrentJob()!=null) {
            jobController.killJob();
            resp = ResponseEntity.status(HttpStatus.OK).body("Job kill requested");
        }
        else resp = ResponseEntity.status(HttpStatus.NOT_FOUND).body("No job running");
        return resp;
    }

    //-------------------------------------------------
    @PostMapping("/job/pause")
    public ResponseEntity pauseJob(){

        ResponseEntity resp = null;
        if(jobController.getCurrentJob()!=null) {
            jobController.pauseJob();
            resp = ResponseEntity.status(HttpStatus.OK).body("Job pause requested");
        }
        else resp = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Job not running");
        return resp;
    }

    //-------------------------------------------------
    @PostMapping("/job/resume")
    public ResponseEntity resumeJob(){

        ResponseEntity resp = null;
        Job curr = jobController.getCurrentJob();
        if(curr!=null && curr.getStatus()== LongRunningWork.StatusEnum.paused) {
            jobController.resumeJob();
            resp = ResponseEntity.status(HttpStatus.OK).body("Job resume requested");
        }
        else resp = ResponseEntity.status(HttpStatus.NOT_FOUND).body("No paused job found");
        return resp;
    }

    //----------------------------------------------------------------------------
    @GetMapping("/job/status")
    @JsonView(JobViews.Default.class)
    @ResponseBody
    public ResponseEntity getJobStatus() {
        Job j = jobController.getCurrentJob();
        return j != null ?
                ResponseEntity.status(HttpStatus.OK).body(j)
                : ErrorResponseEntity.status(HttpStatus.NOT_FOUND).body("No job running");

    }

    //----------------------------------------------------------------------------
    @GetMapping("/job/detailed-status")
    @JsonView(JobViews.Detailed.class)
    @ResponseBody
    public ResponseEntity getDetailedJobStatus() {
        Job j = jobController.getCurrentJob();
        return j != null ?
                ResponseEntity.status(HttpStatus.OK).body(j)
                : ErrorResponseEntity.status(HttpStatus.NOT_FOUND).body("No job running");

    }

    //----------------------------------------------------------------------------
    @GetMapping("/job/status/last")
    @ResponseBody
    public ResponseEntity lastJob() {
        Job j = jobController.getLastJob();
        return j != null ?
                ResponseEntity.status(HttpStatus.OK).body(j)
                : ErrorResponseEntity.status(HttpStatus.NOT_FOUND).body("No previous job");

    }
}
