package com.pratap.designpatterns.structural.facade;


import com.pratap.designpatterns.structural.facade.email.Email;
import com.pratap.designpatterns.structural.facade.email.Mailer;
import com.pratap.designpatterns.structural.facade.email.Stationary;
import com.pratap.designpatterns.structural.facade.email.StationaryFactory;
import com.pratap.designpatterns.structural.facade.email.Template;
import com.pratap.designpatterns.structural.facade.email.Template.TemplateType;
import com.pratap.designpatterns.structural.facade.email.TemplateFactory;
import com.pratap.designpatterns.structural.facade.order.Order;

public class MSEmailFacade implements EmailFacade {
	
	@Override
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
