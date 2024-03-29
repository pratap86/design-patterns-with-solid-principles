package com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.Employee;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.LeaveApprover;

public class ProjectLead extends Employee {

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		// type is sick leave & duration is less than or equal to 2 days.
		if(application.getType() == LeaveApplication.Type.SICK) {
			if(application.getNoOfDays() <= 2) {
				application.approve(getApprovalRole());
				return true;
			}
		}
		
		return false;
	}

}
