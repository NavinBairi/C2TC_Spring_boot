package com.tns.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.entity.Employee;
import com.tns.service.EmployeeService;



@CrossOrigin(origins = "*")
@RestController // is used for making restful web services
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	 // RESTful API methods for Retrieval operations

	@GetMapping("/employees")  //or mapping HTTP GET requests onto specific handler methods
	 public List<Employee> list() 
	 {
	 return service.listAll();
	 }
	
	

	 @GetMapping("/employees/{id}")
	 public ResponseEntity<Employee> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 
		 Employee employee = service.get(id);
	 return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
// RESTful API method for Create operation

	 @PostMapping("/employees") //annotated methods handle the HTTP POST requests matched with given URI expression
	 public void add(@RequestBody Employee employee) 
	 {
	 service.save(employee);
	 }
	 //The GetMapping annotion handles a GET request, 
	 //while PostMapping handles a POST request.
	 
// RESTful API method for Update operation
	 @PutMapping("/employees/{id}")
	 public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable Integer id) 
	 {
	 try
	 {
		 Employee existEmployee = service.get(id);
	 service.save(employee);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
// RESTful API method for Delete operation
	 @DeleteMapping("/employees/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
	 
}





