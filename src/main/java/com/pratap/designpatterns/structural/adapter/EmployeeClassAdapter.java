package com.pratap.designpatterns.structural.adapter;

/**
 * A class adapter, works as two way adapter
 * @author Pratap Narayan
 *
 */
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}

}
