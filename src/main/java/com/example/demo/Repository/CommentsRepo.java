package com.example.demo.Repository;

import com.example.demo.Entities.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comments, Long> {
}