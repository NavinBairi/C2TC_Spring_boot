package com.tns.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.entity.ShopOwner;
import com.tns.service.ShopOwnerService;



@CrossOrigin(origins =  "*")
@RestController
public class ShopOwnerController {

//	private static final HttpStatus ShopOwnersponseEntity = null;
	@Autowired
	private ShopOwnerService service;
	
	@GetMapping("/shopowners")
	 public List<ShopOwner> list() 
	 {
	 return service.listAll();
	 }
	
	@GetMapping("/shopowners/{id}")
	 public ResponseEntity<ShopOwner> get(@PathVariable Integer id) 
	 {
	 try
	 {
		 ShopOwner ShopOwner = service.get(id);
	 return new ResponseEntity<ShopOwner>(ShopOwner, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/ShopOwners")
	 public void add(@RequestBody ShopOwner ShopOwner) 
	 {
	
	service.save(ShopOwner);
	 }
	 
	 @PutMapping("/shopowners/{id}")
		public ResponseEntity<?> update(@RequestBody ShopOwner shopowner, @PathVariable Integer id) {
			try {
				ShopOwner existShopOwner = service.get(id);
				service.save(shopowner);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
	 // RESTful API method for Delete operation
	 @DeleteMapping("/shopowners/{id}")
	 public void delete(@PathVariable Integer  id) 
	 {
	 service.delete(id);
	 
	}
}
