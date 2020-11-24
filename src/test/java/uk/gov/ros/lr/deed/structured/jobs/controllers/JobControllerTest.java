package uk.gov.ros.lr.deed.structured.jobs.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.gov.ros.lr.deed.structured.jobs.model.JobParams;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobControllerTest {

    @Autowired
    JobController jobController;

    @Test
    public void startJob() {

        JobParams p = new JobParams();
        p.setAction("custom");
        p.setBatches("178006");


        jobController.startJob(p);


    }
}