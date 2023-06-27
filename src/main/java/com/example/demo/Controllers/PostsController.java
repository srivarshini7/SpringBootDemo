package com.example.demo.Controllers;

import com.example.demo.Entities.Posts;
import com.example.demo.Services.PostService;
import com.example.demo.dto.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value="/PostData")
public class PostsController {
    @Autowired
    PostService postService;

    @PostMapping("/save/{id}")
    public Posts insertPost(@RequestBody Posts post) {
        return postService.savePost(post);
    }
    @PostMapping("/saveAll")
    public List<Posts> addAllPosts(@RequestBody List<Posts> postsList) {
        return postService.saveAllPosts(postsList);
    }
    @GetMapping("/get")
    public List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/get/{id}")
    public Posts findPostsById(@PathVariable long id) {
        return postService.getPostById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable long id) {
        postService.deletePost(id);
    }
    @PutMapping("/update/{id}")
    public Posts updateThePost(@RequestBody Posts post) {
        return postService.updatePost(post);
    }

    //    for posts
    @GetMapping("/GetPostInfo")
    public List<PostResponse> getAllPostsInfo(){
        return postService.getJointPostInfo();
    }
    //    for post by id
    @GetMapping("GetPosts/{id}")
    public PostResponse getaPostInfoById(@PathVariable long id){
        return postService.getPostInfoById(id);
    }
}
