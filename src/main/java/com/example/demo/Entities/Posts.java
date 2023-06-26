package com.example.demo.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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


    @OneToMany(targetEntity = Comments.class, cascade = CascadeType.ALL)
    @JoinColumn(name="post_id", referencedColumnName = "id")
    private List<Comments> posts;
}