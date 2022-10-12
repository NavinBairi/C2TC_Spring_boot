package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.OrderDetails;
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> 
{
	
}
