package com.example.demo.Repository;

import com.example.demo.Entities.Posts;
import com.example.demo.dto.PostResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Long> {

    @Query("SELECT new com.example.demo.dto.PostResponse(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p")
    public List<PostResponse> getPostInformation();

    @Query("SELECT new com.example.demo.dto.PostResponse(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p where p.id =:id")
    public PostResponse getPostById(@Param("id") long id);
}
