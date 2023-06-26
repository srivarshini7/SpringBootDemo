package com.example.demo.Controllers;
import com.example.demo.Entities.Users;
import com.example.demo.Repository.UsersRepo;
import com.example.demo.Services.UserService;
import com.example.demo.dto.CommentsResponse;
import com.example.demo.dto.PostResponse;
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

//    for posts
    @GetMapping("/GetPostInfo")
    public List<PostResponse> getJointPostInfo(){
        return usersRepo.getPostInformation();
    }
//    for post by id
    @GetMapping("GetPosts/{id}")
    public PostResponse getPostInfoById(@PathVariable long id){
        return usersRepo.getPostById(id);
    }
//    for all the comments
    @GetMapping("/GetAllCommentsInfo")
    public List<CommentsResponse> getJointCommentsInfo(){
        return usersRepo.getCommentsInformation();
    }
//    each comments by its id
    @GetMapping("GetPosts/{id}/Comments")
    public List<CommentsResponse> getCommentsInfoById(@PathVariable long id){
        return usersRepo.getCommentsById(id);
    }
//    grouped by postId
    @GetMapping("GetComments/{id}")
    public CommentsResponse getCommentInfoByCommentId(@PathVariable long id){
        return usersRepo.getCommentById(id);
    }
}

