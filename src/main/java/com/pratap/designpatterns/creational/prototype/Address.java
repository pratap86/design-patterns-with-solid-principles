package com.pratap.designpatterns.creational.prototype;

public class Address implements Cloneable {

	private String streetName;
	
	private String houseNumber;

	public Address(String streetName, String houseNumber) {
		this.streetName = streetName;
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Address(streetName, houseNumber);
	}
	
	
	
}
