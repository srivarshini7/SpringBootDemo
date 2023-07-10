package com.example.demo.Repository;
import com.example.demo.Entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface MarksRepo extends JpaRepository<Marks, Integer> {
    List<Marks> findByExamType(String examType);




}
