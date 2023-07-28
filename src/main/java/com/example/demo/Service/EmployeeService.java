package com.example.demo.Service;
import com.example.demo.Entity.EmployeeDetails;
import com.example.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeDetails saveEmployee(EmployeeDetails employee){
        return employeeRepo.save(employee);
    }
    public List<EmployeeDetails> saveEmployeeDetails(List<EmployeeDetails> employeeDetails){
        return employeeRepo.saveAll(employeeDetails);
    }
    public List<EmployeeDetails> getAllEmployees(){
        return employeeRepo.findAll();
    }
    public EmployeeDetails getEmployeesById(int id){
        return employeeRepo.findById(id).orElse(null);
    }
}

