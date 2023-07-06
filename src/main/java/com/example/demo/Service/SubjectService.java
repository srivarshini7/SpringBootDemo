package com.example.demo.Service;
import com.example.demo.Entity.Subjects;
import com.example.demo.Repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service

public class SubjectService {
    @Autowired
    SubjectRepo subjectRepo;

    public Subjects saveSubject(Subjects subjects){
        return subjectRepo.save(subjects);
    }

    public List<Subjects> saveAllSubject(List<Subjects> subjects){
        return subjectRepo.saveAll(subjects);
    }
    public List<Subjects> getAllSubject(){
        return subjectRepo.findAll();
    }


    public Subjects getSubjectById(int id){
        return subjectRepo.findById(id).orElse(null);
    }

    public String deleteSubject(int id){
        subjectRepo.deleteById(id);
        return "the "+id+" subject data has been deleted";
    }

    public Subjects updateSubjects (Subjects subjects){
        Subjects existingSubjects = subjectRepo.findById(subjects.getId()).orElse(null);
        existingSubjects.setId(subjects.getId());
        return subjectRepo.save(existingSubjects);
    }
}
