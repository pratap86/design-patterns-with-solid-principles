package com.pratap.designpatterns.behaviour.chainofresponsbility.handler;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;
/**
 * An Abstract Handler
 * @author Pratap Narayan
 *
 */
public abstract class Employee implements LeaveApprover {

	private String role;
	
	// store successor
	private LeaveApprover nextApprover;
	
	public Employee(String role, LeaveApprover nextApprover) {
		this.role = role;
		this.nextApprover = nextApprover;
	}

	/**
	 * we check if we can process the request. If not then we pass on to the next handler in chain
	 */
	@Override
	public void processRequest(LeaveApplication application) {
		// continuously iterate in each concrete handler until & unless found a concrete handler
		if(!processLeaveApplication(application) && nextApprover != null) {
			nextApprover.processRequest(application);
		}
	}

	@Override
	public String getApprovalRole() {
		return role;
	}
	
	/**
	 * implement by concrete handler by their own business logic
	 * @param application
	 * @return result
	 */
	protected abstract boolean processLeaveApplication(LeaveApplication application);

}
