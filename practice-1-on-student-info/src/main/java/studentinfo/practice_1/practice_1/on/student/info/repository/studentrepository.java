package studentinfo.practice_1.practice_1.on.student.info.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import studentinfo.practice_1.practice_1.on.student.info.model.studentmodel;

import java.util.List;

public interface studentrepository extends MongoRepository<studentmodel, Integer> {
    public List<studentmodel> findBySubjects(int n);
}

