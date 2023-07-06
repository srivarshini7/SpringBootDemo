package com.example.demo.Controllers;
import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/save/{id}")
    public Student insertStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/saveAll")
    public List<Student> addAllStudent(@RequestBody List<Student> studentList) {
        return studentService.saveAllStudents(studentList);
    }
    @GetMapping("/get")
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Student findStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

//    @GetMapping("/stuInfo")
//    public List<MarksByExam> getStudentInformation(){
//        return studentService.getTheStudentInfo();
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
    @PutMapping("/update/{id}")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

}
