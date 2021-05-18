package com.pratap.designpatterns.structural.adapter;

public class Main {

	public static void main(String[] args) {

		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String designCard = designer.designCard(adapter);
		System.out.println(designCard);
	}

	private static void populateEmployeeData(Employee employee) {

		employee.setFullName("Pratap Narayan");
		employee.setJobTitle("Senior Associates");
		employee.setOfficeLocation("Bangalore");
	}

}
