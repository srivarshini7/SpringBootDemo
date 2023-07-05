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
public class Student {
    @Id
    public int id;
    @Column(name="student_name")
    public String studentName;

    @OneToMany(targetEntity = Exams.class, cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "id")
    private List<Exams> Exams;
}
