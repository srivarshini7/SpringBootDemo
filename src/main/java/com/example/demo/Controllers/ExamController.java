package com.example.demo.Controllers;
import com.example.demo.Entity.Exams;
import com.example.demo.Service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    ExamService examService;

    @PostMapping("/save/{id}")
    public Exams insertExams(@RequestBody Exams exams) {
        return examService.saveExam(exams);
    }
    @PostMapping("/saveAll")
    public List<Exams> addAllExams(@RequestBody List<Exams> examsList) {
        return examService.saveAllExams(examsList);
    }
    @GetMapping("/get")
    public List<Exams> getAllExams() {
        return examService.getAllExams();
    }
    @GetMapping("/get/{id}")
    public Exams findExamsById(@PathVariable int id) {
        return examService.getExamsById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteExamsById(@PathVariable int id) {
        examService.deleteExam(id);
    }
    @PutMapping("/update/{id}")
    public Exams updateExams(@RequestBody Exams exams) {
        return examService.updateExams(exams);
    }
}
