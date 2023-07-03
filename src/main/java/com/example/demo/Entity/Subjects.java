package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="subject_table")

public class Subjects {
    @Id
    public int id;
    @Column(name="student_name")
    public String studentName;
    @Column(name="marks")
    public int marks;
}
