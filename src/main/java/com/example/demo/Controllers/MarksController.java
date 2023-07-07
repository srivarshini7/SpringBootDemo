package com.example.demo.Controllers;
import com.example.demo.DTO.DataByExam;
import com.example.demo.Entity.Marks;
import com.example.demo.Service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/marks")
public class MarksController {
    @Autowired
    MarkService markService;
    @PostMapping("/save/{id}")
    public Marks insertMarks(@RequestBody Marks marks) {
        return markService.saveMarks(marks);
    }
    @PostMapping("/saveAll")
    public List<Marks> addAllMarks(@RequestBody List<Marks> marksList) {
        return markService.saveAllMarks(marksList);
    }
    @GetMapping("/get")
    public List<Marks> getAllMarks() {
        return markService.getAllMarks();
    }
    @GetMapping("/get/{id}")
    public Marks findMarksById(@PathVariable int id) {
        return markService.getMarksById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteMarksById(@PathVariable int id) {
        markService.deleteMarks(id);
    }
    @PutMapping("/update/{id}")
    public Marks updateTheMarks(@RequestBody Marks marks) {
        return markService.updateMarks(marks);
    }
    @GetMapping("/getList")
    public List<DataByExam> getExamData() {
        return markService.getStudentList();
    }

}
