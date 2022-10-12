package com.tns.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.Item;
import com.tns.repository.ItemRepository;
@Service
@Transactional
public class ItemService 
{
 @Autowired
 private ItemRepository repo;
 
 public List<Item> listAll() 
 {
 return repo.findAll();
 }
 
 public void save(Item item) 
 {
 repo.save(item);
 }
 
 public Item get(Integer id) 
 {
 return repo.findById(id).get();
 }
 
 public void delete(Integer id) 
 {
 repo.deleteById(id);
 }
}


