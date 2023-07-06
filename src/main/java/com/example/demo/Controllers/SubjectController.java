package com.example.demo.Controllers;
import com.example.demo.Entity.Subjects;
import com.example.demo.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @PostMapping("/save/{id}")
    public Subjects insertExams(@RequestBody Subjects subjects) {
        return subjectService.saveSubject(subjects);
    }
    @PostMapping("/saveAll")
    public List<Subjects> addAllExams(@RequestBody List<Subjects> subjectList) {
        return subjectService.saveAllSubject(subjectList);
    }
    @GetMapping("/get")
    public List<Subjects> getAllSubject() {
        return subjectService.getAllSubject();
    }
    @GetMapping("/get/{id}")
    public Subjects findExamsById(@PathVariable int id) {
        return subjectService.getSubjectById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteExamsById(@PathVariable int id) {
        subjectService.deleteSubject(id);
    }
    @PutMapping("/update/{id}")
    public Subjects updateExams(@RequestBody Subjects subjects) {
        return subjectService.updateSubjects(subjects);
    }
}
