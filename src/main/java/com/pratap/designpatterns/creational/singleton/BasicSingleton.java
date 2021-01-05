package com.pratap.designpatterns.creational.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

	private static final long serialVersionUID = 6324747369628151625L;

	private BasicSingleton() {}
	
	private static final BasicSingleton INSTANCE = new BasicSingleton();
	
	public static BasicSingleton getInstance() {
		return INSTANCE;
	}
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	protected Object readResolve() {
		return INSTANCE;
	}
}
