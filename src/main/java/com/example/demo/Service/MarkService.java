package com.example.demo.Service;
import com.example.demo.Entity.Marks;
import com.example.demo.Repository.MarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MarkService {
    @Autowired
    MarksRepo marksRepo;
    public Marks saveMarks(Marks marks){
        return marksRepo.save(marks);
    }
    public List<Marks> saveAllMarks(List<Marks> marks){
        return marksRepo.saveAll(marks);
    }
    public List<Marks> getAllMarks(){
        return marksRepo.findAll();
    }
    public Marks getMarksById(int id){
        return marksRepo.findById(id).orElse(null);
    }
    public String deleteMarks(int id){
        marksRepo.deleteById(id);
        return "the "+id+" user data has been deleted";
    }
    public Marks updateMarks (Marks marks){
        Marks existingMarks = marksRepo.findById(marks.getId()).orElse(null);
        existingMarks.setId(marks.getId());
        existingMarks.setExamType(marks.getExamType());
        existingMarks.setEnglish(marks.getEnglish());
        existingMarks.setMathematics(marks.getMathematics());
        existingMarks.setScience(marks.getScience());
        existingMarks.setSocial(marks.getSocial());
        return marksRepo.save(existingMarks);
    }
    public List<Marks> getAllMarksByExamType(String examType) {
        return marksRepo.findByExamType(examType);
    }

    public List<Marks> getAllSubjects() {
        return marksRepo.findAll();
    }

    public Marks createSubject(int studentId, Marks subject) {

        Marks subject1 = marksRepo.findById(studentId).map(student -> {
            return marksRepo.save(subject);
        }).orElseThrow(() -> new RuntimeException("no data of " + studentId));
        return subject1;
    }
}
