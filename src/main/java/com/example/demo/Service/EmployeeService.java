package com.example.demo.Service;
//import com.example.demo.DTO.TaxDetails;
import com.example.demo.Entity.EmployeeDetails;
import com.example.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;


//    First API

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

//   Second API
    public Map<String, Object> getTaxInformation(int employeeId) {
        Map<String, Object> result = new HashMap<>();
        EmployeeDetails employee = employeeRepo.findById(employeeId).orElse(null);
        if (employee != null) {
            int salary = employee.getSalary();
            int totalSalary = 0;
            totalSalary = salary*12;
            int cesAmount = 0;
            int taxAmount =0;
            String taxPercentage;
            if(totalSalary> 2500000){
                cesAmount =( 2* totalSalary)/100;
            }
            if(totalSalary<=250000){
                taxAmount=0;
                taxPercentage="Zero Tax";
            }
            else if((totalSalary>250000)&&(totalSalary<=500000)){
                taxAmount=(5*totalSalary)/100;
                taxPercentage=" 5% Tax";
            }
            else if((totalSalary>500000)&&(totalSalary<=1000000)){
                taxAmount=(10*totalSalary)/100;
                taxPercentage=" 10% Tax";
            }
            else{
                taxAmount=(20*totalSalary)/100;
                taxPercentage=" 20% Tax";
            }
            result.put("AnnualSalary", totalSalary);
            result.put("cesAmount", cesAmount);
            result.put("TaxDeduction", taxAmount);
            result.put("taxInfo",taxPercentage);

        }
        return result;
    }







}

