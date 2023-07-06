package com.example.demo.Repository;
import com.example.demo.Entity.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SubjectRepo extends JpaRepository<Subjects, Integer> {

}