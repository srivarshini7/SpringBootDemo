package com.example.demo.Service;


import com.example.demo.Entity.Students;
import com.example.demo.Repository.StudentsRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@SpringBootTest

public class StudentServiceTests {
    @MockBean
    StudentsRepo studentsRepo;
    @Autowired
    private StudentService studentService;

   @Test
    void testSaveStudent(){
        Students student = new Students(1, "Siri", "A",("1"), ("Sem 1"), (41), (42),(43), (44 ));
        when(studentsRepo.save(student)).thenReturn(student);
        assertThat(studentService.saveStudent(student)).isEqualTo(student);
    }


//    @Test
//    void testSaveAllStudent(){
//        List<Students> studentsList = (new Students(1,  "Siri", "A",("1"), ("Sem 1"), (41), (42),(43), (44 )), new Students(2, "Sri", "A",("2"), ("Sem 1"), (43), (45),(44), (46)));
//        when(studentsRepo.saveAll(studentsList)).thenReturn(studentsList);
//        assertThat(studentService.saveStudent(Students)).isEqualTo(studentsList);
//    }

    @Test
    void getStudentTest(){
       when(studentsRepo.findAll()).thenReturn(Stream.of(new Students(1, "Siri", "A",("1"), ("Sem 1"), (41), (42),(43), (44)),new Students(2, "Serena", "A",("1"), ("Sem 1"), (45), (46),(47), (48))).collect(Collectors.toList()));
       assertThat(studentService.getAllStudents().size());
    }


    @Test
    void deleteStudentTest(){
       Students student = new Students(1, "Siri", "A",("1"), ("Sem 1"), (41), (42),(43), (44 ));
       doAnswer(Answers.CALLS_REAL_METHODS).when(studentsRepo).deleteById(any());
       assertThat(studentService.deleteStudent(student.getId())).isEqualTo("the 0 user data has been deleted");
    }

}

