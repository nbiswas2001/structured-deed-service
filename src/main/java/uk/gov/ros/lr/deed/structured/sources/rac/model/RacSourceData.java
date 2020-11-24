package uk.gov.ros.lr.deed.structured.sources.rac.model;


import lombok.Getter;
import uk.gov.ros.lr.deed.structured.model.util.ToStringHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * SourceData from RAC abridgement entry
 */
public class RacSourceData extends SourceData {

    //abridgement_entries.abridgement_entry_reference
    @Getter
    private String reference;

    //abridgement_entries.abridgement_entry_date
    @Getter
    private LocalDate entryDate;

    //counties.county_code
    @Getter
    private String countyCode;

    //counties.nas_county_code
    @Getter
    private String nasCountyCode;

    //abridgement_entries.abridgement_entry_text
    @Getter
    private String entryText;

    //abridgement_entries.collection_type
    @Getter
    private String collectionType;

    //abridgement_entries.volume_id
    @Getter
    private String volumeId = null;

    //abridgement_entries.page_id
    @Getter
    private String pageId = null;

    //abridgement_entries.yearly_running_no
    @Getter
    private String yearlyRunningNum = null;

    //abridgement_entries.daily_running_no
    @Getter
    private String dailyRunningNum = null;

    //Persons obtained by joining with person_index_entries
    @Getter
    private List<RacParty> parties = new ArrayList<RacParty>();
    public void addParty(RacParty party) { parties.add(party);}

    //Places obtained by joining with place_index_entries
    @Getter
    private List<RacPlace> places = new ArrayList<RacPlace>();
    public void addPlace(RacPlace place) { places.add(place);}

    //----------------------------------------------------
    public RacSourceData(String reference, LocalDate entryDate,
                         String countyCode, String nasCountyCode, String entryText,
                         String collectionType, String volumeId, String pageId,
                         String yearlyRunningNum, String dailyRunningNum) {
        this.reference = reference;
        this.entryDate = entryDate;
        this.countyCode = countyCode;
        this.nasCountyCode = nasCountyCode;
        this.entryText = entryText;
        this.collectionType = collectionType;
        this.volumeId = volumeId;
        this.pageId = pageId;
        this.yearlyRunningNum = yearlyRunningNum;
        this.dailyRunningNum = dailyRunningNum;
        this.deedRef = computeDeedRef();

    }
    public RacSourceData(){}
    
    //RAC = 'B'
    private static String sourcePrefix = "B";

    //------------------------------------------------------------
    //Algorithm to compute unique value for deed reference number
    @Override
    protected String computeDeedRef() {

        StringBuilder sb = new StringBuilder(sourcePrefix);
        sb.append(encode(Long.parseLong(this.reference)));
        return sb.toString();
    }

    //---------------------------
    @Override
    public String toString() {
        return ToStringHelper.getString(this, false);
    }

    //--------------------------
    public String toJson() {
        return ToStringHelper.getJson(this, true);
    }
}
