package com.example.crud_spring_ang.controller;

import com.example.crud_spring_ang.entity.Employee;
import com.example.crud_spring_ang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
         return employeeService.saveEmployee(employee);
    }

    @GetMapping("/get/employee")
    public List<Employee> getEmployees(){
       return employeeService.getEmployee();
    }

    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
        return employeeService.getEmployees(employeeId);
    }

    @DeleteMapping("/delete/employee/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId){
        employeeService.deleteEmployees(employeeId);
    }

    @PutMapping("/update/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
       return employeeService.updateEmployees(employee);
    }

}
