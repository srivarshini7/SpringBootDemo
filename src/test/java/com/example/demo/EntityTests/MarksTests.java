package com.example.demo.EntityTests;

import com.example.demo.Entity.Marks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarksTests {
    public Marks createTestSuite(){
        return new Marks();
    }

    @Test
    public void testGetId() {
        Marks marks =null;
        marks = createTestSuite();
        marks.getId();
    }
    @Test
    public void setId() {
        int id=1;
        Marks marks =null;
        marks = createTestSuite();
        marks.setId(1);
        assertEquals(marks.getId(),id);
    }

    @Test
    public void testGetExamType() {
        Marks marks =null;
        marks = createTestSuite();
        marks.getExamType();
    }
    @Test
    public void setExamType() {
        String examType="Sem 1";
        Marks marks =null;
        marks = createTestSuite();
        marks.setExamType("Sem 1");
        assertEquals(marks.getExamType(),examType);
    }
    @Test
    public void testGetEnglishMarks() {
        Marks marks =null;
        marks = createTestSuite();
        marks.getEnglish();
    }
    @Test
    public void setEnglish() {
        int english= 45;
        Marks marks = null;
        marks = createTestSuite();
        marks.setEnglish(45);
        assertEquals(marks.getEnglish(),english);
    }

    @Test
    public void testGetMathematicsMarks() {
        Marks marks =null;
        marks = createTestSuite();
        marks.getMathematics();
    }
    @Test
    public void setMathematics() {
        int mathematics= 46;
        Marks marks = null;
        marks = createTestSuite();
        marks.setMathematics(46);
        assertEquals(marks.getMathematics(),mathematics);
    }

    @Test
    public void testGetScienceMarks() {
        Marks marks =null;
        marks = createTestSuite();
        marks.getScience();
    }
    @Test
    public void setScience() {
        int science= 47;
        Marks marks = null;
        marks = createTestSuite();
        marks.setScience(47);
        assertEquals(marks.getScience(),science);
    }

    @Test
    public void testGetSocialMarks() {
        Marks marks =null;
        marks = createTestSuite();
        marks.getSocial();
    }
    @Test
    public void setSocial() {
        int social= 48;
        Marks marks = null;
        marks = createTestSuite();
        marks.setSocial(48);
        assertEquals(marks.getSocial(),social);
    }






}
