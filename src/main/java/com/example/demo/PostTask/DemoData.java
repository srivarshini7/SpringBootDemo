package com.example.demo.PostTask;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "data_table")
public class DemoData {
    @Id
    private long id;
    @Column(name="userId")
    private long userId;
    @Column(name="Title")
    private String title;
    @Column(name="Body")
    private String body;
}
