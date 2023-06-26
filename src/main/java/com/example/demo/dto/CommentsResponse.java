package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentsResponse {
    private long postId;
    private long id;
    private String name;
    private String email;
    private String body;
}
