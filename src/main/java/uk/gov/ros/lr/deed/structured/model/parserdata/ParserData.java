package uk.gov.ros.lr.deed.structured.model.parserdata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import uk.gov.ros.lr.deed.structured.model.RacAbridgement;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Data generated during automatic parsing of
 * deed abridgement
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParserData {


    //Gives the level of structure of this entity.
    @Getter @Setter
    private StructureLevelEnum level = null;

    // The code of the error encountered during last parse attempt
    @Getter @Setter
    private ParseErrorEnum error = null;

    // The version of the parsing algorithm.
    //  Set to the next value in each iteration
    @Getter @Setter
    private int algorithmVersion;

    // The abridgment text with tokens inserted for Parties
    @Getter @Setter
    private String tokenisedSeg1Text;

    // The names of Parties that have been tokenised
    @Getter @Setter
    private List<PartyName> partyNames = new ArrayList<>();

    //Chunk - start to end of deed type
    @Getter @Setter
    private DeedBlock deedBlock;

    //Chunk - end of deed type to end of grantor
    @Getter @Setter
    private TextBlock grantorBlock;

    //Chunk - end of grantor to end of grantee
    @Getter @Setter
    private TextBlock granteeBlock;

    //Chunk - subjects
    @Getter @Setter
    private TextBlock subjectsBlock;

    //Chunk - subjects
    @Getter @Setter
    private TextBlock signingDatesBlock;

    @Transient @Getter @Setter
    private RacAbridgement abridgement;


    @Transient @JsonIgnore
    @Getter @Setter
    private StructuredContent structuredContent;

    @Getter @Setter
    private List<String> errorMessages;

    //==============================================
    // The level of structure attained by the parser
    public enum StructureLevelEnum {
        raw,          // As available in RAC
        basic,        //Only deed type identified
        ignored,      //Parse not attempteed
        parseable,    //Grantor, Grantee and Subjects blocks identified. Potentially parseable
        le //Parsed Grantor and Grantee
    }

    //============================================
    // This gives error during parsing, if any
    public enum ParseErrorEnum{
        none,       //Parse was successful i.e. level='le'
        na,         //Parse wasn't attempted i.e. level='ignored'

        //Then for level='parseable'
        grammar,    //Parsing failed i.e. grammar was incorrect
        parseTree, //Model couldn't be populated from parse tree
        incomplete  //Grantor, Grantee blocks not available in abridgement
    }


}
