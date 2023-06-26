package com.example.demo.Services;
import com.example.demo.Entities.Comments;
import com.example.demo.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CommentService {
    @Autowired
    CommentsRepo commentsRepo;
    public Comments saveComments(Comments comments){
        return commentsRepo.save(comments);
    }
    public List<Comments> saveAllComments(List<Comments> comments){
        return commentsRepo.saveAll(comments);
    }
    public List<Comments> getAllComments(){
        return commentsRepo.findAll();
    }
    public Comments getCommentsById(long id){
        return commentsRepo.findById(id).orElse(null);
    }
    public String deleteComments(long id){
        commentsRepo.deleteById(id);
        return "the "+id+" Post data has been deleted";
    }
    public Comments updateComments (Comments comments){
        Comments existingComments = commentsRepo.findById(comments.getId()).orElse(null);
        existingComments.setId(comments.getId());
        existingComments.setName(comments.getName());
        existingComments.setEmail(comments.getEmail());
        existingComments.setBody(comments.getBody());
        return commentsRepo.save(existingComments);
    }
}
