package com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;
import com.pratap.designpatterns.behaviour.chainofresponsbility.constants.Type;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.Employee;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.LeaveApprover;

public class ProjectLead extends Employee {

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}
	
	@Override
	protected boolean processLeaveApplication(LeaveApplication application) {
		// Type(leave) is sick & duration is less than or equal to 2 days.
		if(application.getType() == Type.SICK) {
			if(application.getNoOfDays() <= 2) {
				application.approve(getApprovalRole());
				return true;
			}
		}
		
		return false;
	}

}
