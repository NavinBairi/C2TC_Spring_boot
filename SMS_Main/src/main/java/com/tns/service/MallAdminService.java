package com.tns.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.MallAdmin;
import com.tns.entity.ShopOwner;
import com.tns.repository.MallAdminRepository;

@Service
@Transactional
public class MallAdminService {

@Autowired	
private MallAdminRepository repo;
	
	public List<MallAdmin> listAll() {
		return repo.findAll();
	}
	
	public MallAdmin save(MallAdmin malladmin) {
		repo.save(malladmin);
		return malladmin;
	}
	
	public MallAdmin get(Integer id) {
		MallAdmin malladmin = repo.findById(id).get();
		return malladmin;
		
	}

	public MallAdmin delete(Integer id) {
		MallAdmin  malladmin = repo.findById(id).get();
		repo.deleteById(id);                    //deleteShop(long id):Boolean
		return  malladmin;
	}
}

