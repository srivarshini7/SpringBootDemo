package com.example.demo.Repository;
import com.example.demo.DTO.AverageMarks;
import com.example.demo.DTO.MarksByExam;
import com.example.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer > {
    @Query("SELECT new com.example.demo.DTO.AverageMarks(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p")
    public List<AverageMarks> getAverageMarksInfo();

    @Query("SELECT new com.example.demo.DTO.MarksByExam(u.id,p.id,p.title,p.body) FROM Users u JOIN u.users p where p.id =:id")
    public List<MarksByExam> getMarksByExams(@Param("id") long id);
}
