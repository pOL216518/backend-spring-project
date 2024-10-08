package com.example.crud_spring_ang.service;

import com.example.crud_spring_ang.dao.EmployeeDao;
import com.example.crud_spring_ang.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    public Employee saveEmployee(Employee employee){
        return employeeDao.save(employee);
    }

    public List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
        employeeDao.findAll().forEach(employees :: add);
        return employees;
    }

    public Employee getEmployees(Integer employeeId){
      return employeeDao.findById(employeeId).orElseThrow();
    }

    public void deleteEmployees(Integer employeeId){
        employeeDao.deleteById(employeeId);
    }

    public Employee updateEmployees(Employee employee){
        employeeDao.findById(employee.getEmployeeId()).orElseThrow();
        return employeeDao.save(employee);
    }
}
