package com.tns.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.Shop;
import com.tns.repository.IShopRepository;

@Service
@Transactional
public class ShopService {
	
	
	@Autowired
	private IShopRepository repo;
	
	public List<Shop> listAll() {
		return repo.findAll();
	}
	
	public Shop save(Shop shop) {
		repo.save(shop);
		return shop;
	}
	
	public Shop get(Integer id) {
		Shop shop = repo.findById(id).get();
		return shop;
	}

	public Shop delete(Integer id) {
		Shop shop = repo.findById(id).get();
		repo.deleteById(id);                    //deleteShop(long id):Boolean
		return shop;
	}
	
}
/*addShop(Shop shop) : Shop
+updateShop(Shop shop) : Shop
+searchShopById(long id):Shop
+addEmployee(Employee employee): Boolean
+updateEmployee(Employee employee): Boolean
+deleteShop(long id):Boolean
+addItem(Item item):Item
*/