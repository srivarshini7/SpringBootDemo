package com.example.demo.Controllers;
import com.example.demo.Entity.EmployeeDetails;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Tax")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/save/{id}")
    public EmployeeDetails insertEmployee(@RequestBody EmployeeDetails employee) {
        return employeeService.saveEmployee(employee);
    }
    @PostMapping("/saveAll")
    public List<EmployeeDetails> insertEmployees(@RequestBody List<EmployeeDetails> employeeList) {
        return employeeService.saveEmployeeDetails(employeeList);
//        checking if the branch is working properly
    }
    @GetMapping("/get")
    public List<EmployeeDetails> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/get/{id}")
    public EmployeeDetails findEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeesById(id);
    }

    @GetMapping("/getInfo/{id}")
    public Map<String, Object> findEmployeeInfoById(@PathVariable int id) {
        return employeeService.getTaxInformation(id);
    }

}
