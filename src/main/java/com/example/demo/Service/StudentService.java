package com.example.demo.Service;
import com.example.demo.Entity.Marks;
import com.example.demo.Entity.Students;
import com.example.demo.Repository.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Object> getStudentMarks(int studentId) {
        Map<String, Object> result = new HashMap<>();
        Students student = studentsRepo.findById(studentId).orElse(null);
        if (student != null) {
            List<Marks> subjects = student.getMarks();
            int totalMarks = 0;
            for (Marks subject : subjects) {
                totalMarks += subject.getEnglish() + subject.getMathematics() + subject.getScience() + subject.getSocial();
            }
            int averageMarks = totalMarks / subjects.size();
            result.put("student", student);
            result.put("totalMarks", totalMarks);
            result.put("averageMarks", averageMarks);
        }
        return result;
    }

    public List<Students> getAllStudentsDetails() {
        return studentsRepo.findAll();
    }

    public Students getClassTopper(){
        return studentsRepo.getClassTopper();
    }
}
