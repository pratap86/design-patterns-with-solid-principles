package com.pratap.designpatterns.structural.decorator;

public class Client {

	public static void main(String[] args) {

		Message message = new TextMessage("The <Delhi> is capital of India.");
		System.out.println(message.getContent());
		
		Message decorator = new HtmlEncodeMessage(message);
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodeMessage(decorator);
		System.out.println(decorator.getContent());
		
		
	}

}
