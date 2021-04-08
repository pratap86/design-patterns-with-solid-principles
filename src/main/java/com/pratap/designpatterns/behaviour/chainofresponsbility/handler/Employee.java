package com.pratap.designpatterns.behaviour.chainofresponsbility.handler;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;

public abstract class Employee implements LeaveApprover {

	private String role;
	
	private LeaveApprover successor;
	
	public Employee(String role, LeaveApprover successor) {
		this.role = role;
		this.successor = successor;
	}

	@Override
	public void processLeaveApplication(LeaveApplication application) {
		// continuously iterate in each concrete handler until & unless found a concrete handler
		if(!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		}
	}

	@Override
	public String getApprovalRole() {
		return role;
	}
	
	protected abstract boolean processRequest(LeaveApplication application);

}
