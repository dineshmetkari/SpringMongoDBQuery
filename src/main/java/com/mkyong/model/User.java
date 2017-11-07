package com.mkyong.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection = "users")
public class User {
		
	@Id
	private String id;
	
	@Indexed
	private String ic;
	
	private String name;
	
	private int age;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(String ic, String name, int age, Address address) {
		super();
		this.ic = ic;
		this.name = name;
		this.age = age;
		this.address=address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ic=" + ic + ", name=" + name + ", age=" + age +  ",addresstype="+ address.getAddressType()+",addressarea="+ address.getArea()+"]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
