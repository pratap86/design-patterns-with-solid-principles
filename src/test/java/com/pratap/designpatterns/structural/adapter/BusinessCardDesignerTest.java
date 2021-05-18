package com.pratap.designpatterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BusinessCardDesignerTest {

	@Test
	void testDesignCard_Class_Adapter() {

		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String expected = designer.designCard(adapter);

		assertAll(
				() -> assertNotNull(expected, "should not be null"),
				() -> assertTrue(expected.contains("Pratap Narayan")),
				() -> assertTrue(expected.contains("Senior Associates")),
				() -> assertTrue(expected.contains("Bangalore")));

	}
	
	@Test
	void testDesignCard_Object_Adapter() {

		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String expected = designer.designCard(objectAdapter);

		assertAll(
				() -> assertNotNull(expected, "should not be null"),
				() -> assertTrue(expected.contains("Pratap Narayan")),
				() -> assertTrue(expected.contains("Senior Associates")),
				() -> assertTrue(expected.contains("Bangalore")));

	}

	private static void populateEmployeeData(Employee employee) {

		employee.setFullName("Pratap Narayan");
		employee.setJobTitle("Senior Associates");
		employee.setOfficeLocation("Bangalore");
	}

}
