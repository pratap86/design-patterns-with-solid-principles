package com.pratap.designpatterns.structural.proxy.protection;

public class Car implements Drivable {

	protected Driver driver;
	
	public Car(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String drive() {
		return "Car being driven by Driver age is "+driver.getAge();
	}
	
}
