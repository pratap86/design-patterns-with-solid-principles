package com.pratap.designpatterns.structural.decorator;

import java.util.Base64;

public class Base64EncodeMessage implements Message {

	private Message message;
	
	public Base64EncodeMessage(Message message) {
		this.message = message;
	}


	@Override
	public String getContent() {
		return Base64.getEncoder().encodeToString(message.getContent().getBytes());
	}

}
