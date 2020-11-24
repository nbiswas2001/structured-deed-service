package uk.gov.ros.lr.deed.structured.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import uk.gov.ros.lr.deed.structured.model.LrDeed;

public interface LrDeedRepo extends MongoRepository<LrDeed, String> {

    //--------------------------------
    LrDeed getByReference(String ref);

    //--------------------------------
    @Query(value="{'reference' : ?0 }", fields="{structuredContent:0, parserData:0, 'racAbridgement.parties':0, 'racAbridgement.places':0}")
    LrDeed getByReference_Basic(String ref);

    //--------------------------------
    @Query(value="{'reference' : ?0 }", fields="{parserData:0}")
    LrDeed getByReference_NoParserData(String ref);

    //--------------------------------
    boolean existsByReference(String ref);

    //--------------------------------
    Long countByBatchSeq(int batchSeq);

    //--------------------------------
    @Query(value="{'countyCode' : ?0, 'year' : ?1, 'racAbridgement.yearlyRunningNum' : ?2 }", fields="{parserData:0}")
    LrDeed findDeedByYearlyRunningNo(String countyCode, int year, String yrlyRunningNo);
}
