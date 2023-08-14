package com.example.demo.Controller;
import com.example.demo.Controllers.MarksController;
import com.example.demo.Entity.Marks;
import com.example.demo.Service.MarkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MarksController.class)
public class MarksControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private MarkService markService;
    Marks marks1;

    List<Marks> marksList = new ArrayList<>();
    @Test
    void getMarksDetailsById() throws Exception {
        when(markService.getMarksById(1)).thenReturn(marks1);
        this.mockMvc.perform(get("/marks/get/" + "1")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void getAllMarksDetails() throws Exception{
        when(markService.getAllMarks()).thenReturn(marksList);
        this.mockMvc.perform(get("/marks/get"))
                .andDo(print()).andExpect(status().isOk());
    }
    @Test
    void deleteStudentDetails() throws Exception {
        when(markService.deleteMarks(1))
                .thenReturn("Student marks are Deleted Successfully");
        this.mockMvc.perform(delete("/marks/delete/" + "1"))
                .andDo(print()).andExpect(status().isOk());
    }
}
