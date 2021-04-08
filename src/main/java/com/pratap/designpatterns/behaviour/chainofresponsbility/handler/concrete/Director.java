package com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;
import com.pratap.designpatterns.behaviour.chainofresponsbility.constants.Type;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.Employee;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.LeaveApprover;
/**
 * A concrete handler
 * @author Pratap Narayan
 *
 */
public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}
	@Override
	protected boolean processRequest(LeaveApplication application) {

		if(application.getType() == Type.PTO) {
			if(application.getNoOfDays() <= 8) {
				application.approve(getApprovalRole());
				return true;
			} else {
				application.reject(getApprovalRole());
				return true;
			}
			
		}
		return false;
	}

}
