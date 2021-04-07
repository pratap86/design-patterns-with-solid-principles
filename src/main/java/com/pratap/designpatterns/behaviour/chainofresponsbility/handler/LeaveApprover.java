package com.pratap.designpatterns.behaviour.chainofresponsbility.handler;

import com.pratap.designpatterns.behaviour.chainofresponsbility.LeaveApplication;

/**
 * This represent handler in chain of responsibility
 * 
 * @author Pratap Narayan
 *
 */
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApprovalRole();
}
