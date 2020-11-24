package uk.gov.ros.lr.deed.structured.sources.rac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gov.ros.lr.deed.structured.jobs.model.Batch;
import uk.gov.ros.lr.deed.structured.sources.rac.repos.RacDb;
import uk.gov.ros.lr.deed.structured.sources.rac.model.RacParty;
import uk.gov.ros.lr.deed.structured.sources.rac.model.RacPlace;
import uk.gov.ros.lr.deed.structured.sources.rac.model.RacSourceData;
import uk.gov.ros.lr.deed.structured.model.LrDeed;
import uk.gov.ros.lr.deed.structured.model.RacAbridgement;
import uk.gov.ros.lr.deed.structured.repos.LrDeedRepo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Component
public class RacDataLoader {

    private RacDb racDb;
    private LrDeedRepo lrDeedRepo;

    @Autowired
    public RacDataLoader(RacDb racDb, LrDeedRepo lrDeedRepo) {
        this.racDb = racDb;
        this.lrDeedRepo = lrDeedRepo;
    }

    //--------------------------------------
    public void loadDeedsInBatch(Batch currentBatch){

        int batchSeq = currentBatch.getBatchSeq();
        int month = batchSeq % 100;
        int year = batchSeq /100;
        racDb.connect();

        if(currentBatch.getTotalItems() == -1) {
            long count = racDb.getCountOnMonth(month, year);
            currentBatch.setTotalItems(count);
            currentBatch.setTotalPages(count > 0 ? 1 : 0);
        }

        ResultSet rs = racDb.getRecordsOnMonth(month, year);
        try {

            while (rs.next()) {
                RacSourceData sd = populateSourceData(rs, batchSeq, racDb);

                LrDeed lrDeed = lrDeedRepo.getByReference(sd.getDeedRef());
                if(lrDeed == null) {

                    try {
                        lrDeed = new LrDeed(
                                sd.getDeedRef(),
                                sd.getCountyCode(),
                                sd.getEntryDate(),
                                LrDeed.SourceRegisterEnum.sasines,
                                batchSeq);

                        RacAbridgement racAbridgement = new RacAbridgement(
                                sd.getReference(),
                                sd.getEntryText(),
                                sd.getCollectionType(),
                                sd.getVolumeId(),
                                sd.getPageId(),
                                sd.getYearlyRunningNum());

                        lrDeed.setRacAbridgement(racAbridgement);
                        //Todo - Set parties and places
                        lrDeedRepo.save(lrDeed);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        //TODO Write to logfile
                        currentBatch.incrementDeedsFailed();
                    }
                    currentBatch.incrementDeedsProcessed();
                }
            }

            racDb.disconnect();

        } catch (Exception e) {
            throw new RuntimeException("Failed to load deeds in batch "+batchSeq, e);
        }
    }

    //----------------------------------------------------------------------
    public static RacSourceData populateSourceData(ResultSet rs, int batchSeq, RacDb racDb) throws SQLException {

        Date dt = rs.getDate("dt");
        LocalDate dt2 = Instant.ofEpochMilli(dt.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();

        String collType = rs.getString("collType");
        String altRef = rs.getString("altRef");

        //Correct collection type where missing
        if(collType == null || collType.equals("")) {
            if(altRef != null && altRef.startsWith("P.R.")) collType = "PR";
            else collType = "GR";
        }

        //Set vol and page for PR entries
        String volId = rs.getString("vol_id");
        String pageId = rs.getString("page_id");
        if(altRef!=null && collType.equals("PR")) {
            String[] temp = altRef
                    .replace(",", ".")
                    .replace(" ", "")
                    .split(".");
            if(temp.length >= 4) {
                volId = temp[2];
                pageId = temp[3];
            }
        }

        RacSourceData rac = new RacSourceData(
                rs.getString("ref"),
                dt2,
                rs.getString("ccode"),
                rs.getString("nas_ccode"),
                removeNonAscii(rs.getString("text")),
                collType,
                volId,
                pageId,
                rs.getString("yrly_rn"),
                rs.getString("daily_rn")
        );

        ResultSet rs1 = racDb.getPartiesInAbridgement(rac.getReference());
        while (rs1.next()) {
            RacParty py = loadParty(rs1);
            rac.addParty(py);
        }

        ResultSet rs2 = racDb.getPlacesInAbridgement(rac.getReference());
        while (rs2.next()) {
            RacPlace pl = loadPlace(rs2);
            rac.addPlace(pl);
        }

        rac.setBatchSeq(batchSeq);
        return rac;
    }
    //--------------------------------------
    private static String removeNonAscii(String text){
        if(text != null) {
            String r = text
                    .replace("—", "~") //change separators
                    .replace("$", "") //probably as ocr error
                    .replace("£", "$") //change pound symbol as it is non-ascii
                    .replace("¥","Y") //correct probable ocr errors
                    .replaceAll("[^\\x20-\\x7E]", ""); // remove all other non-ascii
            return r;
        }
        else return "";

    }

    //---------------------------------------
    private static RacParty loadParty(ResultSet rs) throws SQLException {
        RacParty p = new RacParty(
                rs.getString("surname"),
                rs.getString("o_names"),
                rs.getString("sub_o_names")
        );
        return p;
    }

    //---------------------------------------
    private static RacPlace loadPlace(ResultSet rs) throws SQLException {
        RacPlace p = new RacPlace(
                rs.getString("place"),
                rs.getString("area"),
                rs.getString("sub_area")
        );
        return p;
    }
}
