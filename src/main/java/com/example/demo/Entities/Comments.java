package com.example.demo.Entities;

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
@Table(name="comments_table")
public class Comments {
    @Id
    private long id;
    @Column(name= "name")
    private String name;
    @Column(name= "email")
    private String email;
    @Column(name= "body")
    private String body;
}