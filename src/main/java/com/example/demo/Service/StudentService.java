package com.example.demo.Service;
import com.example.demo.DTO.DataByExam;
import com.example.demo.Entity.Students;
import com.example.demo.Repository.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentsRepo studentsRepo;
    public Students saveStudent(Students student){
        return studentsRepo.save(student);
    }
    public List<Students> saveAllStudents(List<Students> students){
        return studentsRepo.saveAll(students);
    }
    public List<Students> getAllStudents(){
        return studentsRepo.findAll();
    }
    public Students getStudentById(int id){
        return studentsRepo.findById(id).orElse(null);
    }
    public String deleteStudent(int id){
        studentsRepo.deleteById(id);
        return "the "+id+" user data has been deleted";
    }
    public Students updateStudent (Students student){
        Students existingStudent = studentsRepo.findById(student.getId()).orElse(null);
        existingStudent.setId(student.getId());
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setSection(student.getSection());
        return studentsRepo.save(existingStudent);
    }



}
