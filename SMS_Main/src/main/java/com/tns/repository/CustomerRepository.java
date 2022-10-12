package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> 
{

}
