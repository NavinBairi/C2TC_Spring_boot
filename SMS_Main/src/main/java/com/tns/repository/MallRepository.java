package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Mall;

public interface MallRepository  extends JpaRepository<Mall, Integer> 
{

}