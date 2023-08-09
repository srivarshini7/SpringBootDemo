package com.example.demo.Repository;

import com.example.demo.Entities.Users;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepoTest {
    @Autowired
    private UsersRepo userRepo;

    Users user;

    @BeforeEach
    void setUp(){
        user = new Users(2,"Lily");
        userRepo.save(user);

    }
    @AfterEach
    void tearDown (){
        user = null;
        userRepo.deleteAll();
    }
}











