package com.pratap.designpatterns.structural.proxy.protection;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarProxyTest {

	private Driver validDriver;
	private Driver invalidDriver;
	private Car car;
	
	@BeforeEach
	public void setup() {
		validDriver = new Driver(17);
		invalidDriver = new Driver(15);
	}
	
	@Test
	void testDriveWithValidDriverAge() {
		car = new CarProxy(validDriver);
		String result = car.drive();
		assertNotNull(result, "result should not be null");
		assertEquals(result, "Car being driven by Driver age is 17");
	}
	
	@Test
	public void testDriveWithInvalidDriverAge_Should_Throw_Exception() {
	
		Throwable exceptionThatWasThrown = assertThrows(IllegalArgumentException.class, () -> new CarProxy(invalidDriver).drive());
		
		assertEquals(exceptionThatWasThrown.getMessage(), "Driver is too young");
	}

}
