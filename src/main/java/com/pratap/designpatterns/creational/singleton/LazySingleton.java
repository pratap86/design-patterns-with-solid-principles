package com.pratap.designpatterns.creational.singleton;

public class LazySingleton {

	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("Initialising a lazy singleton..");
	}
	// it could be raise a potential race condition, apply double check locking
	public static LazySingleton getInstance() {
		
		if( instance == null ) {
			synchronized (LazySingleton.class) {
				if( instance == null ) {
					instance = new LazySingleton();					
				}
			}
		}
		return instance;
	}
}
