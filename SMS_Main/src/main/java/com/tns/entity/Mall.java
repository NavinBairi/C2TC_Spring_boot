package com.tns.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mall")
public class Mall {
	
	@Id
	private Integer id;
	private String mallAdmin;
	private String mallName;
	private String location;
	private String categories;
	
	public Mall()
	{	
		System.out.println("Done with Mall");
	}
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallAdmin=" + mallAdmin + ", mallName=" + mallName + ", location="
				+ location + ", categories=" + categories + "]";
	}

	
	
}
