package eu.techmoodivns.opi.service;

import eu.techmoodivns.opi.model.domain.Subject;
import eu.techmoodivns.opi.repository.SubjectRepository;
import eu.techmoodivns.support.validation.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static eu.techmoodivns.support.random.RandomUtils.transportProperties;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAll() {
        return getAll(null);
    }

    public List<Subject> getAll(String search) {
        return subjectRepository.findAll();
    }

    public void create(Subject subject) {
        subjectRepository.save(subject);
    }

    public void update(String id, Subject updates) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);

        transportProperties(updates, subject);

        subjectRepository.save(subject);
    }
}
