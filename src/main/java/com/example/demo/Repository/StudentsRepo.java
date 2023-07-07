package com.example.demo.Repository;

import com.example.demo.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Integer> {

//    @Query("SELECT new com.example.demo.dto.PostResponse(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p")
//    public List<PostResponse> getPostInformation();
//
//    @Query("SELECT new com.example.demo.dto.PostResponse(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p where p.id =:id")
//    public PostResponse getPostById(@Param("id") long id);





}
