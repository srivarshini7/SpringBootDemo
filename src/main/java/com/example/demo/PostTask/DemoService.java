package com.example.demo.PostTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoRepo demoRepo;
    public void saveDemoData(DemoData demoData){

    }

}
