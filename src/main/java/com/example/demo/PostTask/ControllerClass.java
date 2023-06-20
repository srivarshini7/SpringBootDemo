package com.example.demo.PostTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/demoData")
public class ControllerClass {
    @Autowired
    DemoRepo demoRepo;

//   save one object
    @PostMapping("/post/{id}")
    public DemoData insertData(@RequestBody DemoData demoData) {
        System.out.println("Your record saved successfully!!");
        return demoRepo.save(demoData);
    }

    //    save all
    @PostMapping("/posts")
    public List<DemoData> addAllData(@RequestBody List<DemoData> demoData){
        return demoRepo.saveAll(demoData);
    }

    @GetMapping("/getPosts")
    public List<DemoData> getAllData(@RequestBody List<DemoData> demoData){
        return demoRepo.findAll();
    }

    @GetMapping("/getPosts/{id}")
    public DemoData findDataById(@PathVariable long id){
        return demoRepo.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id){
        demoRepo.deleteById(id);
        System.out.println("The element has been deleted!!");
    }

    @PutMapping("/update/{id}")
    public DemoData updateData(@RequestBody DemoData demoData){
        DemoData existingData= demoRepo.findById(demoData.getId()).orElse(null);
        existingData.setId(demoData.getId());
        existingData.setUserId(demoData.getUserId());
        existingData.setTitle(demoData.getTitle());
        existingData.setBody(demoData.getBody());
        return demoRepo.save(existingData);
    }
}




//        public Student updateStudent (Student student){
//       Student existingStudent= repository.findById(student.getId()).orElse(null);
//        existingStudent.setStudentName(student.getStudentName());
//        existingStudent.setStudentEmail(student.getStudentEmail());
//        existingStudent.setStudentAddress(student.getStudentAddress());
//        return repository.save(existingStudent);
//    }
//
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteStudent(@PathVariable long id){
//        return service.deleteStudent(id);
//    }





//    @PutMapping("/update")
//    public Student updateStudent(@RequestBody Student student){
//        return service.updateStudent(student);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteStudent(@PathVariable long id){
//        return service.deleteStudent(id);
//    }
//}



//    public List<DemoData> dataDetails() throws IOException{
//        ObjectMapper mapper = new ObjectMapper();
//        List<DemoData> data = mapper.readValue(new File("src/main/resources/Data.json"), List.class);
//        return data;
//    }


