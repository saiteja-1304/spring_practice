package studentinfo.practice_1.practice_1.on.student.info.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentinfo.practice_1.practice_1.on.student.info.model.studentmodel;
import studentinfo.practice_1.practice_1.on.student.info.service.studentservice;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    private studentservice ser;
    @GetMapping("/allstudents")
    public List<studentmodel> displayall(@RequestParam Optional<Integer> subjects){
        System.out.println("subjects = " + subjects);
        if (subjects.isPresent()) return ser.displayall(subjects.get());
        return ser.displayall();
    }

    @PostMapping("/addstudent")
    public studentmodel addstudent(@RequestBody studentmodel std){
        return ser.addstudent(std);
    }

    @PostMapping("/addstudents")
    public List<studentmodel> addstudents(@RequestBody List<studentmodel> stds){
        return ser.addstudents(stds);
    }

    @GetMapping("/getstudent/{id}")
    public studentmodel getstudnet(@PathVariable int id){
        return ser.getstudent(id);
    }

    @GetMapping("/deletestudent/{id}")
    public  String deletestudent(@PathVariable int id){
        return ser.deletestudent(id);
    }


}
