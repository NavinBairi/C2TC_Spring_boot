package com.tns.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Item;
public interface ItemRepository extends JpaRepository<Item, Integer> 
{
	
}
