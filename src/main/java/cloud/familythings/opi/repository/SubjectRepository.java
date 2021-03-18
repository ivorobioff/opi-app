package cloud.familythings.opi.repository;

import cloud.familythings.opi.model.domain.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String> {

}
