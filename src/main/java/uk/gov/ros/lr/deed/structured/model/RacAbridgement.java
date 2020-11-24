package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The data about a LR Deed held in Sasines and extracted from RAC
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RacAbridgement {

    public RacAbridgement(String reference,
                          String entryText,
                          String collectionType,
                          String volumeId, String pageId,
                          String yearlyRunningNum) {
        this.reference = reference;
        this.entryText = entryText;
        this.collectionType = collectionType;
        this.volumeId = volumeId;
        this.pageId = pageId;
        this.yearlyRunningNum = yearlyRunningNum;
    }

    //-----------------------------------
    //abridgement_entries.abridgement_entry_reference
    @Getter @Setter
    private String reference;

    //-----------------------------------
    //abridgement_entries.abridgement_entry_text
    @Getter @Setter
    private String entryText;


    //-----------------------------------
    //Entry text after manual correction
    @Getter @Setter
    private String correctedEntryText;

    //-----------------------------------
    //abridgement_entries.collection_type
    @Getter @Setter
    private String collectionType;

    //-----------------------------------
    //abridgement_entries.volume_id
    @Getter @Setter
    private String volumeId;

    //-----------------------------------
    //abridgement_entries.page_id
    @Getter @Setter
    private String pageId;

    //-----------------------------------
    //abridgement_entries.yearly_running_no
    @Getter @Setter
    private String yearlyRunningNum;

    //------------------------------------
    //Persons obtained by joining with person_index_entries
    @Getter @Setter
    private List<String> parties;

    //------------------------------------
    //Places obtained by joining with place_index_entries
    @Getter @Setter
    private List<String> places;

}
