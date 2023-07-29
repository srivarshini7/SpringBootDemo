package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_details")
public class EmployeeDetails {
    @Id
    public int employeeId;
    @Column(name="first_name")
    public String firstName;
    @Column(name="last_name")
    public String lastName;
    @Column(name="email")
    public String email;
    @Column(name="phone")
    public String phoneNumber;
    @Column(name="date_of_joining")
    public String dateOfJoining;
    @Column(name="Salary")
    public double salary;
}

