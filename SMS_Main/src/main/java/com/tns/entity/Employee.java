package com.tns.entity;

import java.time.LocalDate;

//import java.time.LocalDate;

import javax.persistence.*;

@Entity
//@Table(name = "employee")
public class Employee {
	
	private Integer id;
	private String name;
	private double salary;
	private String address ;
	  private String designation;
	private  Integer shop_id;
	private  LocalDate dob ;


	public Employee() {
		System.out.println("done wirh Ëmployee ");	}

	public Employee(Integer id, String name, double salary, String address, String designation, Integer shop_id,
			LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.shop_id = shop_id;
		this.dob = dob;
	}


	@Id 
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getShop_id() {
		return shop_id;
	}

	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",  salary=" + salary + ",address = "+ address +"   "
				+ "designation = "+designation+", shop_id = "+ shop_id+ " ,dob = "+dob +"  ]";
	}

	








	//, shop_id = "+ shop_id+ ",dob = "+dob +"
}
