package uk.gov.ros.lr.deed.structured.repos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import uk.gov.ros.lr.deed.structured.model.LrDeed;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LrDeedRepoPageableTest {

    @Autowired
    LrDeedRepoPageable lrDeedRepoPageable;

    private int batch = 201008;
    @Test
    public void findByBatchSeq() {

        int FAULTY_PAGE = 243;

        for (int pgNum = FAULTY_PAGE; pgNum <= 10000000; pgNum++) {
            System.out.println(pgNum);
            Pageable pageable = PageRequest.of(pgNum, 1);
            Page<LrDeed> page = lrDeedRepoPageable.findByBatchSeq(batch, pageable);
            if(!page.hasContent()) break;
            List<LrDeed> deeds = page.getContent();
        }
    }


    //---------------------------------------------
    @Test
    public void isolateFaultyEntityInBatch(){

        int pageSize = 10000;
        int startPage = 0;
        boolean done = false;
        while(!done) {

            int lastOKPage = -1;
            boolean error = false;

            for (int pgNum = startPage; pgNum <= 10000000; pgNum++) {
                Page<LrDeed> page = null;
                Pageable pageable = PageRequest.of(pgNum, pageSize);
                try {
                    page = lrDeedRepoPageable.findByBatchSeq(batch, pageable);
                    if (!page.hasContent()){
                        done = true;
                        break;
                    }
                    List<LrDeed> deeds = page.getContent();
                }
                catch(InstantiationError e){
                    System.out.println("ERROR - pgSize="+pageSize+", pgNum="+pgNum);
                    error = true;
                }
                if(!done){
                    if(error){

                        if(pageSize==1){
                            System.out.println("Error on record -> " + pgNum);
                            done = true;
                        }
                        else {
                            int oldPageSize = pageSize;
                            pageSize = oldPageSize / 10;
                            startPage = (lastOKPage + 1) * 10;
                        }
                        break;
                    }
                    else {
                        lastOKPage = pgNum;
                    }
                }
            }
        }
        System.out.println("Done!");
    }

}