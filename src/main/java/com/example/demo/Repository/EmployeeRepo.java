package com.example.demo.Repository;

//import com.example.demo.DTO.TaxDetails;
import com.example.demo.Entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository <EmployeeDetails, Integer>{

//    @Query("from EmployeeDetails WHERE employeeId=: id")
//    public List<EmployeeDetails> getInfoById(@Param("id") int id);
}


