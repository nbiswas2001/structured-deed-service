package uk.gov.ros.lr.deed.structured.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import uk.gov.ros.lr.deed.structured.model.parserdata.ParserData;
import uk.gov.ros.lr.deed.structured.model.util.ToStringHelper;

import java.time.LocalDate;


/**
 * A Land Registration Deed. A deed is a legal transaction between two parties. One party (the Grantor)
 * gives rights, with attached responsibilites to another party (the Grantee) over one or more pieces
 * land or property (the Subjects). The LrDeed is a vehicle for change to the LR Title.

 * This entity captures all information about a Land Registration Deed. This includes data in RAC as
 * well as other sources. Also includes information structured by a machine (parser) or a human.
 */

@Document(collection="lrDeed")
@TypeAlias("uk.gov.ros.lr.deed.LrDeed")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LrDeed implements IEntity {

    //------------------------------------------------
    //Mongo id
    @Id @Getter
    private String id;

    //---------------------------------------------------------
    // The unique reference for the deed. This is a 7 character
    //  human readable id made up of letter and numbers. It is
    //  automatically generated from the deed source data. Example 4NB5QW2
    @Getter @Setter
    private String reference;


    //--------------------------------------------------------
    //The actual type of the deed. There are many types
    // of LrDeeds. This gives the main types. The rest come under 'other'
    @Getter @Setter
    private String type;

    //----------------------------------------------
    // The type of land transaction this deed is about
    @Getter @Setter
    private CategoryEnum category;

    //----------------------------------------------
    // The RoS county code for the county that the
    //  subject of this deed belongs to
    @Getter @Setter
    private String countyCode = null;

    //----------------------------------------------
    // The date on which the deed was registered (aka entry date)
    @Getter @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate registrationDate = null;

    //----------------------------------------------
    //The register in which this deed was recorded
    @Getter @Setter
    private SourceRegisterEnum sourceRegister = null;

    //----------------------------------------------
    // The structured data derived by parsing the text
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter @Setter
    private StructuredContent structuredContent = null;

    //---------------------------------------------------
    // The year and month of the deed as a YYYYMM integer
    @Getter @Setter
    private int batchSeq;

    //---------------------------------------
    //The year of the deed. YYYY integer
    @Getter @Setter
    private int year;

    //-----------------------------------------------------
    // The data from the RAC abridgement db, that is
    //   the original source
    @Getter @Setter
    private RacAbridgement racAbridgement;

    //-------------------------------------------------
    // Data generated during parsing. Useful for grammar
    //   debugging and generating ML training sets
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter @Setter
    private ParserData parserData;

    //-------------------------------------------------------------
    // Ctor
    public LrDeed(String reference, String countyCode, LocalDate registrationDate,
                  SourceRegisterEnum sourceRegister, int batchSeq) {
        this.reference = reference;
        this.countyCode = countyCode;
        this.registrationDate = registrationDate;
        this.sourceRegister = sourceRegister;
        this.batchSeq = batchSeq;
    }

    //-------------------------
    // Utility methods
    @Override
    public String toString() {
        return ToStringHelper.getString(this, false);
    }
    public String toJson() {
        return ToStringHelper.getJson(this, true);
    }

    //==============================================
    // The register this deed is from
    public enum SourceRegisterEnum {
        sasines, lr ;
    }

    //==============================================
    // The category of the deed, based on the type
    public enum CategoryEnum {
        saleTfr, lease, mortgage, rightsBurdens, other, unresolved ;
    }
}
