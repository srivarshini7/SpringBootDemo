package com.example.demo.Repository;
import com.example.demo.Entities.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepo extends JpaRepository<Posts, Long> {
}
