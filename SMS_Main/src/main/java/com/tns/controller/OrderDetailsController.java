package com.tns.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.tns.entity.OrderDetails;
import com.tns.service.OrderDetailsService;
@CrossOrigin(origins =  "*")
@RestController
public class OrderDetailsController 
{
 @Autowired
 private OrderDetailsService service;
 
 // RESTful API methods for Retrieval operations
 
 
 @GetMapping("/orders")
 public List<OrderDetails> list() 
 {
 return service.listAll();
 }
 @GetMapping("/orders/{id}")
 public ResponseEntity<OrderDetails> get(@PathVariable Integer id) 
 {
 try
 {
 OrderDetails orderdetails = service.get(id);
 return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/orders")
 public void add(@RequestBody OrderDetails orderdetails) 
 {
 service.save(orderdetails);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/orders/{id}")
 public ResponseEntity<?> update(@RequestBody OrderDetails orderdetails, @PathVariable Integer id) 
 {
 try
 {
 OrderDetails existorderdetails = service.get(id);
 service.save(orderdetails);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/orders/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
}
