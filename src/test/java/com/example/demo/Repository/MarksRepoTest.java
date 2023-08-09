package com.example.demo.Repository;

import com.example.demo.Entity.Marks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.List;

@DataJpaTest
public class MarksRepoTest {

    @Autowired
    MarksRepo marksRepo;
    Marks marks;

    @BeforeEach
    void setUp(){
        marks = new Marks(1,"sem 1",40,42,43,45);
        marksRepo.save(marks);
    }

    @AfterEach
    void tearDown(){
        marks =null;
        marksRepo.deleteAll();
    }


    @Test
    void testFindByExamType_Found() throws Exception
    {
        List<Marks> marksList= marksRepo.findByExamType("sem 1");
        assertThat(marksList.get(0).getId()).isEqualTo(marks.getId());
    }


}
