package com.example.demo.Repository;
import com.example.demo.Entities.Users;
import com.example.demo.dto.CommentsResponse;
import com.example.demo.dto.PostResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UsersRepo extends JpaRepository<Users, Long> {

    @Query("SELECT new com.example.demo.dto.PostResponse(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p")
    public List<PostResponse> getPostInformation();

    @Query("SELECT new com.example.demo.dto.PostResponse(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p where p.id =:id")
    public PostResponse getPostById(@Param("id") long id);


    @Query("SELECT new com.example.demo.dto.CommentsResponse(p.id,c.id,c.name,c.email,c.body) FROM Posts p JOIN p.posts c")
    public List<CommentsResponse> getCommentsInformation();


    @Query("SELECT new com.example.demo.dto.CommentsResponse(p.id,c.id,c.name,c.email,c.body) FROM Posts p JOIN p.posts c where p.id =:id")
    public List<CommentsResponse> getCommentsById(@Param("id") long id);


    @Query("SELECT new com.example.demo.dto.CommentsResponse(p.id,c.id,c.name,c.email,c.body) FROM Posts p JOIN p.posts c where c.id =:id")
    public CommentsResponse getCommentById(@Param("id") long id);


}
