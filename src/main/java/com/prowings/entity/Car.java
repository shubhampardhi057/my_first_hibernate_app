package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	int id;
	@Column
	String name;
	@Column
	String companyName;
	
	
	public Car() {
		super();
	}


	public Car(int id, String name, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", companyName=" + companyName + "]";
	}
	
	
}
