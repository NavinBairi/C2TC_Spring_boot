package com.tns.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.Employee;
import com.tns.repository.EmployeeRepository;


@Service  //It is used to mark the class as a service provider
@Transactional //is used when you want the certain method/class(=all methods inside) to be executed in a transaction

public class EmployeeService {

	@Autowired //is used for dependency injection
	private EmployeeRepository repo;
	
	public List<Employee> listAll()
	{
		return repo.findAll();
	}



	 /*public void save(Employee employee) 
	 {
	 repo.save(employee);
	 }*/
		public Employee save(Employee employee) {
			repo.save(employee);
			return employee;
		}
	 
	 public Employee get(Integer id) 
	 {
		 Employee employee = repo.findById(id).get();
	// return repo.findById(id).get();
	 return employee;
	 }
	 
	/* public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }*/
	 
	 public Employee delete(Integer id) {
		 Employee employee = repo.findById(id).get();
			repo.deleteById(id);                    //deleteShop(long id):Boolean
			return employee;
		}
}


/*+addEmployee(Employee employee) : Employee
+updateEmployee(Employee employee) : Employee
+searchEmployee(long id): Employee
+deleteEmployee(long id):Boolean
*/