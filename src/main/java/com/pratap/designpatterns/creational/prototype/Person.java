package com.pratap.designpatterns.creational.prototype;

public class Person implements Cloneable {

	public String[] names;
	
	public Address address;

	public Person(String[] names, Address address) {
		this.names = names;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Person(names.clone(), (Address)address.clone());
	}
	
}
