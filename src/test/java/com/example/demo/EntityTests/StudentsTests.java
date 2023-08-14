package com.example.demo.EntityTests;

import com.example.demo.Entity.Students;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsTests {
    public Students createTestSuite(){
        return new Students();
    }
    @Test
    public void testGetId() {
        Students students =null;
        students = createTestSuite();
        students.getId();
    }
    @Test
    public void setId() {
        int id=1;
        Students students =null;
        students = createTestSuite();
        students.setId(1);
        assertEquals(students.getId(),id);
    }

    @Test
    public void testGetName() {
        Students students =null;
        students = createTestSuite();
        students.getStudentName();
    }
    @Test
    public void setIdName() {
        String studentName="Alina";
        Students students =null;
        students = createTestSuite();
        students.setStudentName("Alina");
        assertEquals(students.getStudentName(),studentName);
    }

    @Test
    public void testGetSection() {
        Students students =null;
        students = createTestSuite();
        students.getSection();
    }
    @Test
    public void setSection() {
        String section="A";
        Students students =null;
        students = createTestSuite();
        students.setSection("A");
        assertEquals(students.getSection(),section);
    }
}
