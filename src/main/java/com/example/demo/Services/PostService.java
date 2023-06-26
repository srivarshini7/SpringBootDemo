package com.example.demo.Services;
import com.example.demo.Entities.Posts;
import com.example.demo.Repository.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PostService {
    @Autowired
    PostsRepo postsRepo;
    public Posts savePost(Posts posts){
        return postsRepo.save(posts);
    }
    public List<Posts> saveAllPosts(List<Posts> posts){
        return postsRepo.saveAll(posts);
    }
    public List<Posts> getAllPosts(){
        return postsRepo.findAll();
    }
    public Posts getPostById(long id){
        return postsRepo.findById(id).orElse(null);
    }
    public String deletePost(long id){
        postsRepo.deleteById(id);
        return "the "+id+" Post data has been deleted";
    }
    public Posts updatePost (Posts posts){
        Posts existingPosts = postsRepo.findById(posts.getId()).orElse(null);
        existingPosts.setId(posts.getId());
        existingPosts.setTitle(posts.getTitle());
        existingPosts.setBody(posts.getBody());
        return postsRepo.save(existingPosts);
    }
}
