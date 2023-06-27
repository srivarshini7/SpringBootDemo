package com.example.demo.Controllers;
import com.example.demo.Entities.Comments;
import com.example.demo.Repository.CommentsRepo;
import com.example.demo.Services.CommentService;
import com.example.demo.dto.CommentsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/CommentsData")
public class CommentsController {
    @Autowired
    CommentService commentService;

    @Autowired
    CommentsRepo commentsRepo;

    @PostMapping("/save/{id}")
    public Comments insertComment(@RequestBody Comments comments) {
        return commentService.saveComments(comments);
    }
    @PostMapping("/saveAll")
    public List<Comments> addAllComments(@RequestBody List<Comments> commentsList) {
        return commentService.saveAllComments(commentsList);
    }
    @GetMapping("/get")
    public List<Comments> getAllComments() {
        return commentService.getAllComments();
    }
    @GetMapping("/get/{id}")
    public Comments findPostsById(@PathVariable long id) {
        return commentService.getCommentsById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable long id) {
        commentService.deleteComments(id);
    }
    @PutMapping("/update/{id}")
    public Comments updateThePost(@RequestBody Comments comments) {
        return commentService.updateComments(comments);
    }

    //    for all the comments
    @GetMapping("/GetAllCommentsInfo")
    public List<CommentsResponse> getJointCommentsInfo(){
        return commentsRepo.getCommentsInformation();
    }
    //    each comments by its id
    @GetMapping("GetPosts/{id}/Comments")
    public List<CommentsResponse> getCommentsInfoById(@PathVariable long id){
        return commentsRepo.getCommentsById(id);
    }
    //    grouped by postId
    @GetMapping("GetComments/{id}")
    public CommentsResponse getCommentInfoByCommentId(@PathVariable long id){
        return commentsRepo.getCommentById(id);
    }
}
