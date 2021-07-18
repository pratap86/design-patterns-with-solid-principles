package com.pratap.designpatterns.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

/**
 * Decorator. Implements Component interface
 * @author Pratap Narayan
 *
 */
public class HtmlEncodeMessage implements Message {

	private Message message;
	
	public HtmlEncodeMessage(Message message) {
		this.message = message;
	}


	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(message.getContent());
	}

}
