//package com.example.demo.PostTask;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/demoData")
//public class ControllerClass {
//    @Autowired
//    DemoService demoService;
//
//    //   save one object
//    @PostMapping("/post/{id}")
//    public DemoData insertData(@RequestBody DemoData demoData) {
//        return demoService.saveData(demoData);
//    }
//
//    //    save all
//    @PostMapping("/posts")
//    public List<DemoData> addAllData(@RequestBody List<DemoData> demoData) {
//        return demoService.saveAllData(demoData);
//    }
//
//    @GetMapping("/getPosts")
//    public List<DemoData> getAllData(@RequestBody List<DemoData> demoData) {
//        return demoService.getAllData();
//    }
//
//    @GetMapping("/getPosts/{id}")
//    public DemoData findDataById(@PathVariable long id) {
//        return demoService.getDataById(id);
//    }
//
//    @GetMapping("/getByUserId/{userId}")
//    public List<DemoData> getDataByUserId(@PathVariable Long userId) {
//        List<DemoData> findAll = demoService.findAllByUserId(userId);
//        return findAll;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteById(@PathVariable long id) {
//        demoService.deleteData(id);
//    }
//
//    @PutMapping("/update")
//    public DemoData updateTheData(@RequestBody DemoData demoData){
//        return demoService.updateData(demoData);
//    }
//}
//
//
