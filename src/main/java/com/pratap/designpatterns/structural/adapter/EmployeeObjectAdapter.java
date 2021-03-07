package com.pratap.designpatterns.structural.adapter;

/**
 * An Object Adapter, using composition to translate interface
 * @author Pratap Narayan
 *
 */
public class EmployeeObjectAdapter implements Customer {

	private Employee adaptee;
	
	public EmployeeObjectAdapter(Employee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}

}
