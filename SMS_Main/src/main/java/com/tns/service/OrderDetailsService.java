package com.tns.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.OrderDetails;

import com.tns.repository.OrderDetailsRepository;


@Service
@Transactional
public class OrderDetailsService 
{
 @Autowired
 private OrderDetailsRepository repo;
 
 public List<OrderDetails> listAll() 
 {
 return repo.findAll();
 }
 
	public OrderDetails save(OrderDetails orderdetails) {
		repo.save(orderdetails);
		return orderdetails;
	}
	
 public OrderDetails get(Integer id) {
	 OrderDetails orderdetails = repo.findById(id).get();
		return orderdetails;
	}

	public OrderDetails delete(Integer id) {
		OrderDetails  orderdetails= repo.findById(id).get();
		repo.deleteById(id);                    //deleteShop(long id):Boolean
		return  orderdetails;
	}
}


