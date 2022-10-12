package com.tns.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.tns.entity.Mall;
import com.tns.service.MallService;
@CrossOrigin(origins =  "*")
@RestController
public class MallController {
	@Autowired
	private MallService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/malls")
	public List<Mall> list() {
		return service.listAll();
	}

	@GetMapping("/malls/{id}")
	public ResponseEntity<Mall> get(@PathVariable Integer id) {
		try {
			Mall mall = service.get(id);
			return new ResponseEntity<Mall>(mall, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Mall>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/malls")
	public void add(@RequestBody Mall mall) {
		service.save(mall);
	}

	// RESTful API method for Update operation
	@PutMapping("/malls/{id}")
	public ResponseEntity<?> update(@RequestBody Mall mall, @PathVariable Integer id) {
		try {
			service.get(id);
			service.save(mall);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	//@DeleteMapping("/mall/{id}")
	//public void delete(@PathVariable Integer id) {
		//service.delete(id);
	//}
}
