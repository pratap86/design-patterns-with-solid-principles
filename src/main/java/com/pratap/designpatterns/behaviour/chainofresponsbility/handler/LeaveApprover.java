package com.pratap.designpatterns.behaviour.chainofresponsbility.handler;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;

/**
 * This represent handler in chain of responsibility
 * 
 * @author Pratap Narayan
 *
 */
public interface LeaveApprover {

	/**
	 * The method to handle the incoming request, leave application
	 * @param application
	 */
	void processRequest(LeaveApplication application);
	
	String getApprovalRole();
}
