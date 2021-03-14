package eu.techmoodivns.opi.repository;

import eu.techmoodivns.opi.model.domain.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, String> {
}
