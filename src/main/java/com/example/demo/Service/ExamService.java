package com.example.demo.Service;


import com.example.demo.Entity.Exams;
import com.example.demo.Repository.ExamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
    @Autowired
    ExamRepo examRepo;

    public Exams saveExam(Exams exams){
        return examRepo.save(exams);
    }

    public List<Exams> saveAllExams(List<Exams> exams){
        return examRepo.saveAll(exams);
    }
    public List<Exams> getAllExams(){
        return examRepo.findAll();
    }

    public Exams getExamsById(int id){
        return examRepo.findById(id).orElse(null);
    }

    public String deleteExam(int id){
        examRepo.deleteById(id);
        return "the "+id+" user data has been deleted";
    }

    public Exams updateExams (Exams exam){
        Exams existingExams = examRepo.findById(exam.getId()).orElse(null);
        existingExams.setId(exam.getId());
        existingExams.setExamName(exam.getExamName());
        return examRepo.save(existingExams);
    }

}
