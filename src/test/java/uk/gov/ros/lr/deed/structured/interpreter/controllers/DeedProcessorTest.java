package uk.gov.ros.lr.deed.structured.interpreter.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.repos.LrDeedRepo;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeedProcessorTest {

    @Autowired
    DeedProcessor deedProcessor;

    @Autowired
    LrDeedRepo lrDeedRepo;

    @Test
    public void structureDeed() {
        deedProcessor.forceParse = true;
        LrDeed deed = lrDeedRepo.getByReference_Basic("B24QKZ4");
        deedProcessor.structureDeed(deed); //test these as well - B226DFH, B2T24L6
        System.out.println(deed.toJson());
        lrDeedRepo.save(deed);
    }
}