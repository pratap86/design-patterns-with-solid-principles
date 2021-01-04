package com.pratap.designpatterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProtoTypeTest {

	@Test
	void testDeepCloning() throws CloneNotSupportedException {
		
		Person test1 = new Person(new String[] {"John", "Smith"}, new Address("MG Road", "201"));
		
		Person test2 = (Person)test1.clone();
		test2.names[0] = "Jene";
		test2.address.setHouseNumber("202");
		
		assertEquals(test1.names[0], "John");
		assertEquals(test1.address.getHouseNumber(), "201");
		
		assertEquals(test2.names[0], "Jene");
		assertEquals(test2.address.getHouseNumber(), "202");
		
	}

}
