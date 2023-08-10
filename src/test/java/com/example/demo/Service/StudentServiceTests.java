package com.example.demo.Service;


import com.example.demo.Entity.Students;
import com.example.demo.Repository.StudentsRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest

public class StudentServiceTests {
    @MockBean
    StudentsRepo studentsRepo;
    @Autowired
    private StudentService studentService;

    @Test
    void testSaveStudent(){
//        Students student = new Students(1 )
    }
}
