package com.pratap.designpatterns.structural.proxy.protection;

public class CarProxy extends Car {

	public CarProxy(Driver driver) {
		super(driver);
	}

	@Override
	public String drive() {
		if(driver.getAge() > 16)
			return super.drive();
		else
			throw new IllegalArgumentException("Driver is too young");
	}
	
}
