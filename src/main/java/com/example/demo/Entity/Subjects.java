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
    @Column(name="English")
    public int english;
    @Column(name="Mathematics")
    public int mathematics;
    @Column(name="Science")
    public int science;
    @Column(name="Social")
    public int social;



}
