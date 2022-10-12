package com.tns.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;


import com.tns.entity.ShopOwner;
import com.tns.repository.ShopOwnerRepository;

@Service
@Transactional
public class ShopOwnerService {

@Autowired	
private ShopOwnerRepository repo;
	
	public List<ShopOwner> listAll() {
		return repo.findAll();
	}
	
	public ShopOwner save(ShopOwner shopowner) {
		repo.save(shopowner);
		return shopowner;
	}
	
	public ShopOwner get(Integer id) {
		ShopOwner shopowner = repo.findById(id).get();
		return shopowner;
		
	}

	public ShopOwner delete(Integer id) {
		ShopOwner  shopowner = repo.findById(id).get();
		repo.deleteById(id);                    //deleteShop(long id):Boolean
		return  shopowner;
	}
}

