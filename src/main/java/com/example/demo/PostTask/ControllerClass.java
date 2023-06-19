package com.example.demo.PostTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/demodata")
public class ControllerClass {
    @Autowired
    DemoRepo demoRepo;


//   save one object
    @PostMapping("/posts/{id}")
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


//    @GetMapping("/getPosts/{id}")
//    public DemoData findDataById(@PathVariable long id){
//        return demoRepo.findById(DemoData);
//    }

//    @GetMapping("/getPosts/{id}")
//    public ResponseEntity<DemoData> get(@PathVariable Long id) {
//        try {
//            DemoData student = demoRepo.getReferenceById(id);
//            return new ResponseEntity<DemoData>(student, HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<DemoData>(HttpStatus.NOT_FOUND);
//        }
//    }



//    @GetMapping("/student/{studentName}")
//    public Student findStudentByName(@PathVariable String studentName){
//        return service.getStudentByName(studentName);
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




//    @PostMapping("/addMultipleData")
//    public List<Student> addStudents(@RequestBody List<Student> students){
//        return service.saveStudents(students);
//    }
//    @GetMapping("/")
//    public List<Student> findAllStudent(){
//        System.out.println("hello world");
//        return service.getStudents();
//
//    }
//    @GetMapping("/student/{id}")
//    public Student findStudentById(@PathVariable long id){
//        return service.getStudentById(id);
//    }
//    @GetMapping("/student/{studentName}")
//    public Student findStudentByName(@PathVariable String studentName){
//        return service.getStudentByName(studentName);
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
}



//    public List<DemoData> dataDetails() throws IOException{
//        ObjectMapper mapper = new ObjectMapper();
//        List<DemoData> data = mapper.readValue(new File("src/main/resources/Data.json"), List.class);
//        return data;
//    }


