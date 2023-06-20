package com.example.demo.PostTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DemoService {
    @Autowired
    private DemoRepo demoRepo;

    public DemoData saveData(DemoData demoData){
        return demoRepo.save(demoData);
    }
    //post method
    public List<DemoData> saveAllData(List<DemoData> demoData){
        return demoRepo.saveAll(demoData);
    }
    //get method
    public List<DemoData> getAllData(){
        return demoRepo.findAll();
    }

    //get by Id method
    public DemoData getDataById(long id){
        return demoRepo.findById(id).orElse(null);
    }

    public DemoData getDataFiltered(long userId){
        return demoRepo.findAllByUserId(userId);
    }

//    @Transactional
//    public List<DemoData> getDataFiltered(List<Long> userId) {
//        List<DemoData> DataResponse = (List<DemoData>) demoRepo.findAllByUserId(userId);
//        return DataResponse;
//    }

//    get by UserId method





//    public List<DemoData> findAllByUserId(Iterable<Long> userId) {
//        if (entityInformation.hasCompositeId()) {
//
//            List<DemoData> results = new ArrayList<DemoData>();
//
//            for (Long userId : userIds) {
//                findAllByUserId(userId).ifPresent(results::add);
//            }
//
//            return results;
//        }
//
//    }





    //delete method
    public String deleteData(long id){
        demoRepo.deleteById(id);
        return "Student Removed!!" + id;
    }

//update method

    public DemoData updateData (DemoData demoData){
        DemoData existingStudent= demoRepo.findById(demoData.getId()).orElse(null);
        existingStudent.setId(demoData.getId());
        existingStudent.setUserId(demoData.getUserId());
        existingStudent.setTitle(demoData.getTitle());
        existingStudent.setBody(demoData.getBody());
        return demoRepo.save(existingStudent);
    }

    @Transactional(readOnly = true)
    public List<DemoData> findAllByUserId(Long userId) {
        List<DemoData> dataResponse = (List<DemoData>) demoRepo.findAllByUserId(userId);
        return dataResponse;

    }





}
