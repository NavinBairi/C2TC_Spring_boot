package com.tns.entity;

import javax.persistence.*;

@Entity // class is an entity and is mapped to a database table 
//@Table(name = "shop")

public class Shop {
	

	private Integer id;
	private String shopCategory;
	private Integer shopEmployeeID;
	private String shopName;
	private Integer customers;
	private String shopStatus;
	private String shopOwner;
	private String leaseStatus;
	
	public Shop() {
		System.out.println("done with Shop");
	}
	
	
	/*
	public Shop(Integer id, String shopCategory, Integer shopEmployeeID, String shopName, Integer customers,
			String shopStatus, String shopOwner, String leaseStatus) {
		super();
		this.id = id;
		this.shopCategory = shopCategory;
		this.shopEmployeeID = shopEmployeeID;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}*/



	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)

//getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public Integer getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(Integer shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getCustomers() {
		return customers;
	}

	public void setCustomers(Integer customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	
	@Override
	public String toString() {
		return "Shop [shopId=" + id + ", shopCategory=" + shopCategory + ", shopEmployeeID=" + shopEmployeeID
				+ ", shopName=" + shopName + ", customers=" + customers + ", shopStatus=" + shopStatus + ", shopOwner="
				+ shopOwner + ", leaseStatus=" + leaseStatus + "]";
	}
}
