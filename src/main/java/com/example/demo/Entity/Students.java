package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_table")
public class Students {
    @Id
    public int id;
    @Column(name="student_name")
    public String studentName;
    @Column(name="section")
    public String section;
    @OneToMany(targetEntity = Marks.class,cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "id")
    private List<Marks> marks;

    public Students(int i, String name , String Section, String id, String exType, int eng, int math, int sci, int soc) {
    }

    public Students(int i, String name, String Section) {
    }
}
