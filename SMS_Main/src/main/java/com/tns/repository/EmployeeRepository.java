package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{

}
