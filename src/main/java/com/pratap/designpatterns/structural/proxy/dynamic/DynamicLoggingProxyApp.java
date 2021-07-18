package com.pratap.designpatterns.structural.proxy.dynamic;

public class DynamicLoggingProxyApp {

	public static void main(String[] args) {

		Person person = new Person();
	    Human logged = DynamicLoggingProxyUtil.withLogging(person, Human.class);
	    logged.walk();
	    logged.talk();
	    logged.talk();

	    System.out.println(logged);
	}

}
