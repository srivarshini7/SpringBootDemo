package com.example.demo.Repository;

import com.example.demo.Entity.Exams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepo extends JpaRepository<Exams, Integer> {
}
