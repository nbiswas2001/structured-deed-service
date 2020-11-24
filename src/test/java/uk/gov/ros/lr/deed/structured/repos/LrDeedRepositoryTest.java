package uk.gov.ros.lr.deed.structured.repos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.gov.ros.lr.deed.structured.model.DesignatedOrg;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LrDeedRepositoryTest {

    @Autowired
    LrDeedRepo lrDeedRepo;

    @Test
    public void getByReference() {

        LrDeed deed = lrDeedRepo.getByReference("B22DH93");
        assertEquals("B22DH93", deed.getReference());
        assertEquals("ABN", deed.getCountyCode());
        assertEquals(198006, deed.getBatchSeq());
        assertEquals(LocalDate.of(1980,6,2), deed.getRegistrationDate());
        assertNotNull(deed.getRacAbridgement());
        assertEquals("255027", deed.getRacAbridgement().getReference());
        assertEquals("GR", deed.getRacAbridgement().getCollectionType());
        assertEquals("8087", deed.getRacAbridgement().getYearlyRunningNum());
    }

    @Test
    public void findInBatch() {
    }

    @Test
    public void countByBatchSeq() {
    }


    @Test
    public void load(){
        LrDeed deed = lrDeedRepo.getByReference("B2YCSQ7");
    }

    //-----------------------------
    //Drivers
    //@Test
    public void write() {
        LrDeed deed = new LrDeed("XXX", "ABN", LocalDate.of(2000,1,1), LrDeed.SourceRegisterEnum.sasines,200001);
        StructuredContent cnt = new StructuredContent(LocalDateTime.now(), false);
        DesignatedOrg dog = new DesignatedOrg();
        dog.setName("ABC");
        dog.setType(DesignatedOrg.TypeEnum.bank);
        cnt.setGrantee(dog);

        deed.setStructuredContent(cnt);
        lrDeedRepo.save(deed);
    }

}