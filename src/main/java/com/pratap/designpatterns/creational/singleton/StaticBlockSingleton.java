package com.pratap.designpatterns.creational.singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

	private StaticBlockSingleton() throws IOException {
		System.out.println("Initializing Singleton...");
		File.createTempFile(".", ".");
	}
	// instance NOT final
	private static StaticBlockSingleton instance;
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			System.err.println("Failed to create singleton : "+e);
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
