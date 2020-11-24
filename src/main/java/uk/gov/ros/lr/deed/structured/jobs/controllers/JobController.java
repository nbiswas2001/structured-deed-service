package uk.gov.ros.lr.deed.structured.jobs.controllers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import uk.gov.ros.lr.deed.structured.interpreter.controllers.DeedProcessor;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.jobs.model.Batch;
import uk.gov.ros.lr.deed.structured.jobs.model.Job;
import uk.gov.ros.lr.deed.structured.jobs.model.JobParams;
import uk.gov.ros.lr.deed.structured.jobs.model.LongRunningWork.StatusEnum;
import uk.gov.ros.lr.deed.structured.repos.JobRepo;
import uk.gov.ros.lr.deed.structured.repos.LrDeedRepo;
import uk.gov.ros.lr.deed.structured.repos.LrDeedRepoPageable;
import uk.gov.ros.lr.deed.structured.sources.rac.controllers.RacDataLoader;
import uk.gov.ros.lr.deed.structured.sources.rac.model.RacSourceData;
import uk.gov.ros.lr.deed.structured.sources.rac.repos.RacDb;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class JobController {

    private LrDeedRepo lrDeedRepo;
    private LrDeedRepoPageable lrDeedRepoPageable;
    private DeedProcessor deedProcessor;
    private RacDataLoader racDataLoader;
    private JobRepo jobRepo;

    private static final int PAGE_SIZE = 5000;

    //----------------------------------------------
    @Autowired
    public JobController(LrDeedRepo lrDeedRepo,
                         LrDeedRepoPageable lrDeedRepoPageable,
                         DeedProcessor deedProcessor,
                         RacDataLoader racDataLoader,
                         JobRepo jobRepo){
        this.lrDeedRepo = lrDeedRepo;
        this.lrDeedRepoPageable = lrDeedRepoPageable;
        this.deedProcessor = deedProcessor;
        this.racDataLoader = racDataLoader;
        this.jobRepo = jobRepo;
    }

    @Getter
    private Job currentJob;

    @Getter
    private Job lastJob;

    @Getter
    private Batch currentBatch;

    //Timestamps captured when a batch or job starts.
    //Then running duration for a job or batch is calculated as follows
    // duration = last_saved_duration + duration_between(timestamp, current_time)
    // at this point the timestamp is updated again
    private LocalDateTime jobCheckpoint;
    private LocalDateTime batchCheckpoint;

    //----------------------------------------------------------------------------
    public void startJob(JobParams params) {

        try {
            System.out.println("Starting Job - " + params);
            if (currentJob == null) { //only start job if one is not running

                //do actions at start of job
                currentJob = new Job(params);
                jobCheckpoint = LocalDateTime.now();

                //interpret the batches string in the param to get actual batch ids
                List<Integer> batchSeqList = getBatchIdsForJob(params);

                //for each batch id
                for (int batchSeq : batchSeqList) {
                    //Create and add to Job
                    Batch b = new Batch(batchSeq);
                    currentJob.getBatches().add(b);
                }
                jobRepo.save(currentJob);

                String action = currentJob.getParams().getAction();

                //for each batch
                boolean firstBatch = true;
                for (Batch b : currentJob.getBatches()) {
                    currentBatch = b;

                    //do start of batch actions
                    currentJob.setCurrentBatch(currentBatch);
                    currentBatch.setStatus(StatusEnum.running);
                    currentBatch.setStartTime(LocalDateTime.now());
                    batchCheckpoint = LocalDateTime.now();
                    int batch = currentBatch.getBatchSeq();

                    if(action=="load"){
                        racDataLoader.loadDeedsInBatch(currentBatch);
                    }
                    else { // interpret || custom

                        if(currentBatch.getTotalItems() == -1) {
                            Pageable pageable = PageRequest.of(0, PAGE_SIZE);
                            Page<LrDeed> page = lrDeedRepoPageable.findByBatchSeq(batch, pageable);
                            currentBatch.setTotalItems(page.getTotalElements());
                            currentBatch.setTotalPages(page.getTotalPages());
                        }

                        //first batch may be started from a later page
                        int startPage = 0;
                        if(firstBatch){
                            if(params.getStartFromPage() > 0) startPage = params.getStartFromPage();
                            firstBatch = false;
                        }
                        //To make processing more granular, process deeds in pages worth
                        for (int pgNum = startPage; pgNum < currentBatch.getTotalPages(); pgNum++) {

                            //get a page worth of LrDeeds
                            PageRequest pageable = PageRequest.of(pgNum, PAGE_SIZE);
                            Page page = lrDeedRepoPageable.findByBatchSeq(currentBatch.getBatchSeq(), pageable);
                            List<LrDeed> deeds = page.getContent();

                            //for each LrDeed in page
                            for (LrDeed deed : deeds) {

                                //do task
                                try {
                                    switch (action) {
                                        case "interpret":
                                            deedProcessor.structureDeed(deed);
                                            break;
                                        case "custom":
                                            deedProcessor.processCustom(deed);
                                            break;
                                    }
                                }
                                catch (Exception e){
                                    e.printStackTrace();
                                    //TODO Write to logfile
                                    currentBatch.incrementDeedsFailed();
                                }

                                currentBatch.incrementDeedsProcessed();
                            }
                            lrDeedRepoPageable.saveAll(deeds);
                            onEndOfPage(pgNum); //do end of page actions

                            if (jobKilled) break; //break out if job was killed midway
                        }

                    }

                    //do end of batch actions (only if job wasn't killed already)
                    if (!jobKilled) {
                        currentBatch.setStatus(Batch.StatusEnum.completed);
                        currentBatch.setEndTime(LocalDateTime.now());
                        currentJob.incrementBatchesProcessed();
                        jobRepo.save(currentJob);
                        currentBatch = null;
                    } else break; //break out if job was killed midway
                }

                //End of job actions (only if job wasn't killed already)
                if (!jobKilled) {
                    currentJob.setStatus(StatusEnum.completed);
                    currentJob.setEndTime(LocalDateTime.now());
                    jobRepo.save(currentJob);
                    lastJob = currentJob;
                    currentJob = null;
                    System.out.println("Completed Job - " + params);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //--------------------------------------
    //set to true when kill request is received
    private boolean killJob;

    //set to true when job is actually killed
    private boolean jobKilled;

    public void killJob(){
        System.out.println("Trying to kill Job");
        if(!pauseJob && !jobPaused && !jobKilled) killJob = true;
    }

    //-----------------------------
    //set to true when pause request is received
    private boolean pauseJob;

    //set to true when job is actually paused
    private boolean jobPaused;

    public void pauseJob(){
        System.out.println("Trying to pause Job");
        if(!killJob && !jobKilled && !jobPaused & !resumeJob) pauseJob = true;
    }

    //--------------------------------------------
    //set to true when resume request is received
    private boolean resumeJob;

    public void resumeJob(){
        System.out.println("Trying to resume Job");
        if(jobPaused && !jobKilled && !killJob & !pauseJob) resumeJob = true;
    }

    //-----------------------------------------------
    //actions at the end of each page worth of deeds
    private void onEndOfPage(int pageNum){

        currentBatch.setLastPageProcessed(pageNum);

        //checkpoint durations
        currentBatch.updateDuration(batchCheckpoint);
        currentJob.updateDuration(jobCheckpoint);
        batchCheckpoint = LocalDateTime.now();
        jobCheckpoint = LocalDateTime.now();


        if(killJob) { //if kill command received

            //update statuses and times
            currentBatch.setStatus(StatusEnum.killed);
            currentJob.setStatus(StatusEnum.killed);
            currentBatch.setEndTime(LocalDateTime.now());
            currentJob.setEndTime(LocalDateTime.now());

            lastJob = currentJob;
            currentJob = null;
            currentBatch = null;

            killJob = false;
            jobKilled = true;
            System.out.println("Job killed");
        }
        else if(pauseJob){ //if pause command received
            pauseJob = false;
            currentBatch.setStatus(StatusEnum.paused);
            currentJob.setStatus(StatusEnum.paused);
            jobPaused = true;
            System.out.println("Job paused");

            //wait here till you receive an 'unpause' command
            while (!resumeJob) {
                try { Thread.sleep(5000);} catch (InterruptedException e) { e.printStackTrace();}
            }

            //reset checkpoints
            jobCheckpoint = LocalDateTime.now();
            batchCheckpoint = LocalDateTime.now();

            //reset statuses
            currentBatch.setStatus(StatusEnum.running);
            currentJob.setStatus(StatusEnum.running);

            jobPaused = false;
            resumeJob = false;

            System.out.println("Continuing job");
        }
    }

    //---------------------------------------------------
    // Get list if batch ids from a string representation.
    // Possible styles -
    // "198006"
    // "198006, 198007, 198008"
    // "198001-198009"
    // "198001", "199001-199012", "200010", "200501-200506"
    public List<Integer> getBatchIdsForJob(JobParams params) {

        String input = params.getBatches();
        List<Integer> batchIds = new ArrayList<>();
        List<String> batchListItems = new ArrayList<>();
        if (input.contains(",")) {
            String[] temp = input.split(",");
            for (String b : temp) batchListItems.add(b.trim());
        }
        else {
            batchListItems.add(input.trim());
        }

        for (String bli : batchListItems) {
            if(bli.contains("-")) {
                String[] temp = bli.split("-");
                int start = Integer.parseInt(temp[0].trim());
                int end = Integer.parseInt(temp[1].trim());
                for (int i = start; i <= end; i++) {
                    if (i % 100 == 13) i = (i / 100 + 1) * 100 + 1;
                    batchIds.add(i);
                }
            }
            else {
                batchIds.add(Integer.parseInt(bli));
            }
        }
        return batchIds;
    }

}
