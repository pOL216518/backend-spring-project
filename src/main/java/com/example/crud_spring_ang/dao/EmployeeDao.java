package com.example.crud_spring_ang.dao;

import com.example.crud_spring_ang.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
