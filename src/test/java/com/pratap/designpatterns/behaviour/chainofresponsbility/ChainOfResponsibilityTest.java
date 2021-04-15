package com.pratap.designpatterns.behaviour.chainofresponsbility;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import com.pratap.designpatterns.behaviour.chainofresponsbility.constants.Type;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.LeaveApprover;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete.Director;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete.Manager;
import com.pratap.designpatterns.behaviour.chainofresponsbility.handler.concrete.ProjectLead;

class ChainOfResponsibilityTest {

	

	@Test
	void testLeaveApplication_approved_by_manager_Leave_Type_SICK() {
		
		LeaveApplication application = LeaveApplication.getBuilder()
			.withType(Type.SICK)
			.from(LocalDate.of(2021, Month.MARCH, 10))
			.to(LocalDate.of(2021, Month.MARCH, 20))
			.build();
		
		LeaveApprover approver = createChain();
		System.out.println(application);
		approver.processRequest(application);
		assertEquals("SICK leave for 10 day(s) APPROVED by Manager", application.toString());
	}
	
	@Test
	void testLeaveApplication_approved_by_manager_Leave_Type_PTO() {
		
		LeaveApplication application = LeaveApplication.getBuilder()
			.withType(Type.PTO)
			.from(LocalDate.of(2021, Month.MARCH, 10))
			.to(LocalDate.of(2021, Month.MARCH, 15))
			.build();
		
		LeaveApprover approver = createChain();
		System.out.println(application);
		approver.processRequest(application);
		System.out.println(application);
		assertEquals("PTO leave for 5 day(s) APPROVED by Manager", application.toString());
	}
	
	@Test
	void testLeaveApplication_approved_by_director_Leave_Type_PTO() {
		
		LeaveApplication application = LeaveApplication.getBuilder()
			.withType(Type.PTO)
			.from(LocalDate.of(2021, Month.MARCH, 10))
			.to(LocalDate.of(2021, Month.MARCH, 16))
			.build();
		
		LeaveApprover approver = createChain();
		System.out.println(application);
		approver.processRequest(application);
		System.out.println(application);
		assertEquals("PTO leave for 6 day(s) APPROVED by Director", application.toString());
	}
	
	@Test
	void testLeaveApplication_approved_by_lead() {
		
		LeaveApplication application = LeaveApplication.getBuilder()
			.withType(Type.SICK)
			.from(LocalDate.of(2021, Month.MARCH, 10))
			.to(LocalDate.of(2021, Month.MARCH, 12))
			.build();
		
		LeaveApprover approver = createChain();
		System.out.println(application);
		approver.processRequest(application);
		System.out.println(application);
		assertEquals("SICK leave for 2 day(s) APPROVED by Project Lead", application.toString());
	}
	/**
	 * 
	 * setup our chain of responsibility
	 */
	private static LeaveApprover createChain() {
		// we provide the successor in constructor
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;
	}
	
	@Test
	void testLeaveApplication_Reject_by_director_Leave_Type_PTO_MoreThan8Days() {
		
		LeaveApplication application = LeaveApplication.getBuilder()
			.withType(Type.PTO)
			.from(LocalDate.of(2021, Month.MARCH, 10))
			.to(LocalDate.of(2021, Month.MARCH, 19))
			.build();
		
		LeaveApprover approver = createChain();
		System.out.println(application);
		approver.processRequest(application);
		System.out.println(application);
		assertEquals("PTO leave for 9 day(s) REJECTED by Director", application.toString());
	}

}
