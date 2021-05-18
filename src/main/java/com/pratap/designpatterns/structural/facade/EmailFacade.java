package com.pratap.designpatterns.structural.facade;

import com.pratap.designpatterns.structural.facade.order.Order;
/**
 * Facade provides simple methods for client to use
 * @author Pratap Narayan
 *
 */
public interface EmailFacade {

	boolean sendOrderEmail(Order order);
}
