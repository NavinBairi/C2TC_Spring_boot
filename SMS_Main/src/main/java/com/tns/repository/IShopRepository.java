package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Shop;



public interface IShopRepository extends JpaRepository<Shop, Integer> {

}
