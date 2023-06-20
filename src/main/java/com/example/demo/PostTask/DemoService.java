package com.example.demo.PostTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoRepo demoRepo;

//    public DemoData saveData(DemoData demoData){
//        return demoRepo.save(demoData);
//    }
//    //post method
//    public List<DemoData> saveAllData(List<DemoData> demoData){
//        return demoRepo.saveAll(demoData);
//    }
//    //get method
//    public List<DemoData> getStudents(){
//        return demoRepo.findAll();
//    }
//
//    //get by Id method
//    public DemoData getStudentById(long id){
//        return demoRepo.findById(id).orElse(null);
//    }
//
//    //get by Id method
//
//    public DemoData getStudentByName(String studentName){
//        return demoRepo.findByName(studentName);
//    }
//
//    //delete method
//    public String deleteStudent(long id){
//        demoRepo.deleteById(id);
//        return "Student Removed!!" + id;
//    }
//
////update method
//
//    public DemoData updateStudent (DemoData demoData){
//        DemoData existingStudent= demoRepo.findById(student.getId()).orElse(null);
//        existingStudent.setStudentName(student.getStudentName());
//        existingStudent.setStudentEmail(student.getStudentEmail());
//        existingStudent.setStudentAddress(student.getStudentAddress());
//        return demoRepo.save(existingStudent);
//    }

}
