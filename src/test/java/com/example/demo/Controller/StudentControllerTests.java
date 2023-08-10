package com.example.demo.Controller;

import com.example.demo.Controllers.StudentsController;
import com.example.demo.Entity.Students;
import com.example.demo.Service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentsController.class)
public class StudentControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StudentService studentService;
    Students student1;
    Students student2;
    List<Students> studentsList = new ArrayList<>();

    @Test
    void getCloudVendorDetails() throws Exception {
        when(studentService.getStudentById(1)).thenReturn(student1);
        this.mockMvc.perform(get("/Students/get/" + "1")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    void getAllStudentsDetails() throws Exception{
        when(studentService.getAllStudents()).thenReturn(studentsList);
        this.mockMvc.perform(get("/Students/getInfo"))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    void deleteStudentDetails() throws Exception {
        when(studentService.deleteStudent(1))
                .thenReturn("Student details are Deleted Successfully");
        this.mockMvc.perform(delete("/Students/delete/" + "1"))
                .andDo(print()).andExpect(status().isOk());

    }

//    @Test
//    void updateStudentDetails() throws Exception {
//        Students students = new Students();
//        students.setStudentName("Test Name");
//        students.getId(12);
//
//        given(studentService.updateStudent(students.getId(),students));
////        ObjectMapper mapper = new ObjectMapper();
////        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
////        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
////        String requestJson=ow.writeValueAsString(student1);
////
//////        when(studentService.updateStudent("1")).thenReturn(student1);
////
////
////        when(studentService.updateStudent(student1))
////                .thenReturn(student2);
////        this.mockMvc.perform(put("/Students/update/"+ students.getId())
////                        .contentType(MediaType.APPLICATION_JSON)
////                        .content(requestJson))
////                .andDo(print()).andExpect(status().isOk());
//    }
}
