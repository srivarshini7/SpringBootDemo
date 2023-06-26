package com.example.demo.Services;

import com.example.demo.Entities.Users;
import com.example.demo.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UsersRepo usersRepo;

    public Users saveUser(Users user){
        return usersRepo.save(user);
    }

    public List<Users> saveAllUsers(List<Users> users){
        return usersRepo.saveAll(users);
    }
    public List<Users> getAllUsers(){
        return usersRepo.findAll();
    }

    public Users getUserById(long id){
        return usersRepo.findById(id).orElse(null);
    }

    public String deleteUser(long id){
        usersRepo.deleteById(id);
        return "the "+id+" user data has been deleted";
    }

    public Users updateUser (Users users){
        Users existingUser = usersRepo.findById(users.getId()).orElse(null);
        existingUser.setId(users.getId());
        existingUser.setName(users.getName());
        return usersRepo.save(existingUser);
    }
}
