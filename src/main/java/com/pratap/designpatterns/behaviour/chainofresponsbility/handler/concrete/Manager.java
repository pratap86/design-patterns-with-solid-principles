package com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.Employee;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.LeaveApprover;

public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}
	@Override
	protected boolean processLeaveApplication(LeaveApplication application) {

		switch (application.getType()) {
		
		case SICK:
			application.approve(getApprovalRole());
			return true;

		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApprovalRole());
				return true;
			}
			
		default:
			return false;
		}
		
		
	}

}
