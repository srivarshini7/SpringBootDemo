package com.example.demo.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name= "user_table")
public class Users {
    @Id
    private long id;
    @Column(name= "name")
    private String name;

    @OneToMany(targetEntity = Posts.class, cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private List<Posts> users;

    public Users(int i, String name) {
    }
}
