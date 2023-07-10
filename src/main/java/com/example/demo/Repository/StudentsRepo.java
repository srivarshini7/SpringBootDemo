package com.example.demo.Repository;

import com.example.demo.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Integer> {
    @Query(value = "SELECT s FROM Students s WHERE s.id = (SELECT st.id FROM Students st INNER JOIN st.marks sub GROUP BY st.id ORDER BY SUM(sub.english + sub.mathematics + sub.science + sub.social) DESC LIMIT 1)")
    Students getClassTopper();

}
