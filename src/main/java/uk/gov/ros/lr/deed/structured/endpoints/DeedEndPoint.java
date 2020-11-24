package uk.gov.ros.lr.deed.structured.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.gov.ros.lr.deed.structured.interpreter.controllers.DeedProcessor;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.repos.LrDeedRepo;
import uk.gov.ros.lr.deed.structured.repos.LrDeedRepoPageable;

@RestController
public class DeedEndPoint {

    private LrDeedRepo deedRepo;
    private LrDeedRepoPageable deedRepoPageable;
    private DeedProcessor processor;

    @Autowired
    public DeedEndPoint(LrDeedRepo deedRepo,
                        LrDeedRepoPageable deedRepoPageable,
                        DeedProcessor processor){
        this.deedRepo = deedRepo;
        this.deedRepoPageable = deedRepoPageable;
        this.processor = processor;
    }

    //----------------------------------------------------------------------------
    @GetMapping("/deeds/{ref}")
    @ResponseBody
    public ResponseEntity getDeedByReference(@PathVariable String ref){
        return constructDeedResponse(deedRepo.getByReference_NoParserData(ref));
    }

    //----------------------------------------------------------------------------
    @GetMapping("/deeds/{ref}/basic")
    @ResponseBody
    public ResponseEntity getBasicDeedByReference(@PathVariable String ref){
        return constructDeedResponse(deedRepo.getByReference_Basic(ref));
    }

    //----------------------------------------------------------------------------
    @GetMapping("/deeds/{ref}/full")
    @ResponseBody
    public ResponseEntity getFullDeedByReference(@PathVariable String ref){
        return constructDeedResponse(deedRepo.getByReference(ref));
    }

    //----------------------------------------------------------------------------
    @GetMapping(value = "/deeds", params={"county", "year", "yrn"})
    @ResponseBody
    public ResponseEntity findDeed(@RequestParam String county,
                                   @RequestParam int year,
                                   @RequestParam String yrn){

        return constructDeedResponse(deedRepo.findDeedByYearlyRunningNo(county.toUpperCase(), year, yrn));
    }

    //----------------------------------------------------------------------------
    @GetMapping(value = "/deeds", params={"batch", "pagesize", "page"})
    @ResponseBody
    public ResponseEntity findDeedsInBatch(@RequestParam int batch, @RequestParam int pagesize, @RequestParam int page){

        Pageable pageable = PageRequest.of(page, pagesize);
        Page<LrDeed> pageD = deedRepoPageable.findByBatchSeq(batch, pageable);
        return ResponseEntity.status(HttpStatus.OK).body(pageD);
    }

    //----------------------------------------------------------
    @PutMapping("/deeds/{ref}/abridgement/text")
    public ResponseEntity updateCorrectedEntryText(@PathVariable String ref, @RequestBody String entryText){
        System.out.println(entryText);
        LrDeed deed = deedRepo.getByReference(ref);
        if(deed != null) {
            deed.getRacAbridgement().setCorrectedEntryText(entryText);
            processor.structureDeed(deed);
            deedRepo.save(deed);
        }
        return constructDeedResponse(deed);
    }


    //-----------------------------------------------------------
    private ResponseEntity constructDeedResponse(LrDeed deed){
        return deed!=null?
                ResponseEntity.status(HttpStatus.OK).body(deed)
                : ErrorResponseEntity.status(HttpStatus.NOT_FOUND).body("Deed not found");
    }

    //----------------------------------------------------------------------------
    @GetMapping("/deeds/{ref}/struct")
    @ResponseBody
    public ResponseEntity getStructuredContent(@PathVariable String ref){

        ResponseEntity resp = null;
        LrDeed deed = deedRepo.getByReference(ref);
        return deed!=null?
                deed.getStructuredContent()!=null?
                    ResponseEntity.status(HttpStatus.OK).body(deed.getStructuredContent())
                    : ErrorResponseEntity.status(HttpStatus.NOT_FOUND).body("Deed has no structured content")
                : ErrorResponseEntity.status(HttpStatus.NOT_FOUND).body("Deed not found");
    }

}
