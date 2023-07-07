package com.example.demo.Repository;
import com.example.demo.DTO.DataByExam;
import com.example.demo.Entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface MarksRepo extends JpaRepository<Marks, Integer> {
    @Query("SELECT new com.example.demo.DTO.DataByExam(s.id,s.studentName,m.id) FROM Students s JOIN s.marks m")
    public List<DataByExam> getDataByExam();

//    @Query("SELECT new")
}
