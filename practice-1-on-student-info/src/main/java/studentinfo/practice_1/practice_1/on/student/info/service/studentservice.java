package studentinfo.practice_1.practice_1.on.student.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentinfo.practice_1.practice_1.on.student.info.model.studentmodel;
import studentinfo.practice_1.practice_1.on.student.info.repository.studentrepository;

import java.util.List;

@Service
public class studentservice {
    @Autowired
    private studentrepository repo;
    public List<studentmodel>displayall(){
        return repo.findAll();
    }
//    @Override
    public List<studentmodel>displayall(int n){
        return repo.findBySubjects(n);
    }
    public studentmodel addstudent(studentmodel std){
        return repo.save(std);
    }
    public List<studentmodel> addstudents(List<studentmodel> stds){
        return repo.saveAll(stds);
    }
    public studentmodel getstudent(int id){
        return repo.findById(id).orElse(null);
    }
    public String deletestudent(int id){
        repo.deleteById(id);
        return "Deleted all the details regarding the id: " +id;
    }

}
