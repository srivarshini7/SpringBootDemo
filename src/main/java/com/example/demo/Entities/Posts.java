package com.example.demo.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "posts_table")
public class Posts {
    @Id
    private long id;
    @Column(name= "title")
    private String title;
    @Column(name= "body")
    private String body;

}