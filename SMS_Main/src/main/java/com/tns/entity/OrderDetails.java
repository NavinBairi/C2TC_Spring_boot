package com.tns.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OrderDetails 
{
 private Integer id;
 private LocalDateTime dateOfPurchase;
 private float total;
 private String paymentMode;
private float price;
private String name;

 public OrderDetails() 
 {
	 System.out.println("Done with Order_Details");
 }

 public OrderDetails(Integer id, LocalDateTime dateOfPurchase, float total, String paymentMode, float price,
		String name) {
	super();
	this.id = id;
	this.dateOfPurchase = dateOfPurchase;
	this.total = total;
	this.paymentMode = paymentMode;
	this.price = price;
	this.name = name;
}

@Id
 //@GeneratedValue(strategy = GenerationType.IDENTITY)
 public Integer getId() 
 {
 return id;
 }
public void setId(Integer id) 
{
this.id = id;
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public float getPrice() 
{
return price;
}
public void setPrice(float price) 
{
this.price = price;
}
public LocalDateTime getDateOfPurchase() {
	return dateOfPurchase;
}
public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
	this.dateOfPurchase = dateOfPurchase;
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}

@Override
public String toString() {
	return "Order [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", paymentMode="
			+ paymentMode + ", price=" + price + ", name=" + name + "]";
}
 
}
