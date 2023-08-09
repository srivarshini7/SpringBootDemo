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

@Entity
@Table(name= "marks_table")
public class Marks {
    @Id
    public int id;
    @Column(name="exam_type")
    public String examType;
    @Column(name="english")
    public int english;
    @Column(name="mathematics")
    public int mathematics;
    @Column(name="science")
    public int science;
    @Column(name="social")
    public int social;



    public Marks(int id, String examType, int english, int mathematics, int science, int social) {
    }
}
