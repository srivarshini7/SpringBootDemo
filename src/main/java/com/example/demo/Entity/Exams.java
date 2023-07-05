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
@Table(name="exam_table")
public class Exams {
    @Id
    public int id;
    @Column(name="exam_name")
    public String examName;

    @ManyToMany(targetEntity = Subjects.class, cascade = CascadeType.ALL)
    @JoinColumn(name="exam_id", referencedColumnName = "id")
    private List<Subjects> subjects;
}
