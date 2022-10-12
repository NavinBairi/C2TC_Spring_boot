package com.tns.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.entity.MallAdmin;
import com.tns.service.MallAdminService;



@CrossOrigin(origins =  "*")
@RestController
public class MallAdminController {

	@Autowired
	private MallAdminService service;
	@GetMapping("/malladmins")
	 public List<MallAdmin> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/malladmins/{id}")
	 public ResponseEntity<MallAdmin> get(@PathVariable Integer id) 
	 {
	 try
	 {
		 MallAdmin MallAdmin = service.get(id);
	 return new ResponseEntity<MallAdmin>(MallAdmin, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<MallAdmin>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/malladmins")
	 public void add(@RequestBody MallAdmin MallAdmin) 
	 {
	
	service.save(MallAdmin);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/malladmins/{id}")
		public ResponseEntity<?> update(@RequestBody MallAdmin malladmin, @PathVariable Integer id) {
			try {
				MallAdmin existMallAdmin = service.get(id);
				service.save(malladmin);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
	 // RESTful API method for Delete operation
	 @DeleteMapping("/malladmins/{id}")
	 public void delete(@PathVariable Integer id) 
	 {
	 service.delete(id);
	 }
}
