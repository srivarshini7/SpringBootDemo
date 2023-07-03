package com.example.demo.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> saveAllStudents(List<Student> student){
        return studentRepo.saveAll(student);
    }
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }

    public String deleteStudent(int id){
        studentRepo.deleteById(id);
        return "the "+id+" user data has been deleted";
    }

    public Student updateStudent (Student student){
        Student existingStudent = studentRepo.findById(student.getId()).orElse(null);
        existingStudent.setId(student.getId());
        existingStudent.setStudentName(student.getStudentName());
        return studentRepo.save(existingStudent);
    }
}
