package com.mkyong.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
public class Address {
	private String addressType;
	private String area;
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
