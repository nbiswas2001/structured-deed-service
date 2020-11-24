package uk.gov.ros.lr.deed.structured.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import uk.gov.ros.lr.deed.structured.model.LrDeed;

public interface LrDeedRepoPageable extends PagingAndSortingRepository<LrDeed, String> {

    Page<LrDeed> findByBatchSeq(int batchSeq, Pageable pageable);

}
