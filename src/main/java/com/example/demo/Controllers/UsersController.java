package com.example.demo.Controllers;

import com.example.demo.Entities.Users;
import com.example.demo.Repository.UsersRepo;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/UserData")
public class UsersController {
    @Autowired
    UserService userService;

    @Autowired
    UsersRepo usersRepo;

    @PostMapping("/save/{id}")
    public Users insertUser(@RequestBody Users user) {
        return userService.saveUser(user);
    }
    @PostMapping("/saveAll")
    public List<Users> addAllUsers(@RequestBody List<Users> usersList) {
        return userService.saveAllUsers(usersList);
    }
    @GetMapping("/get")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/get/{id}")
    public Users findUsersById(@PathVariable long id) {
        return userService.getUserById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable long id) {
        userService.deleteUser(id);
    }
    @PutMapping("/update/{id}")
    public Users updateTheUser(@RequestBody Users user) {
        return userService.updateUser(user);
    }

}

