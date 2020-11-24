package uk.gov.ros.lr.deed.structured.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import uk.gov.ros.lr.deed.structured.jobs.model.Job;

public interface JobRepo extends MongoRepository<Job, String> {
}
