package com.tns.controller;

import java.util.NoSuchElementException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.entity.User;
import com.tns.service.UserService;

//import antlr.collections.List;

@CrossOrigin(origins = "*")
@RestController
public class UserController 
{
 @Autowired
 private UserService service;
 private User user;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/users")
 
 public java.util.List<User> list() 
 {
 return service.listAll();
 }
 @GetMapping("/Users/{id}")
 public ResponseEntity<User> get(@PathVariable Integer id) 
 {
 try
 {
 User user = service.get(id);
 return new ResponseEntity<User>(user, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
 } 
 }
 
 // RESTful API method for Create operation
 @PostMapping("/users")
 public void add(@RequestBody User user) 
 {
	 service.save(user);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/users/{id}")
 public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) 
 {
 try
 {
 User existUser = service.get(id);
 service.save(user);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/users/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
	
	

}
