package com.example.demo.Controllers;
import com.example.demo.Entity.Students;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/Students")
public class StudentsController {
    @Autowired
    StudentService studentService;
    @PostMapping("/save/{id}")
    public Students insertStudent(@RequestBody Students student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/saveAll")
    public List<Students> addAllStudents(@RequestBody List<Students> studentList) {
        return studentService.saveAllStudents(studentList);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
    @PutMapping("/update/{id}")
    public Students updateTheStudent(@RequestBody Students student) {
        return studentService.updateStudent(student);
    }
    @GetMapping("/getInfo")
    public List<Students> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Students findStudentsById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
