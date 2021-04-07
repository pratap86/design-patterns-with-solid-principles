package com.pratap.designpatterns.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

class BasicSingletonTest {

	@Test
	void testSingleton() throws Exception {

		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(111);
		
		String filename = "singleton.bin";
		saveToFile(singleton, filename);
		
		singleton.setValue(222);
		
		BasicSingleton singleton2 = readFromFile(filename);
		
		assertThat(singleton).isSameAs(singleton2);
		assertEquals(singleton.getValue(), singleton2.getValue());
		
	}

	// Break the singleton - Serialization
	
	static void saveToFile(BasicSingleton singleton, String filename) throws Exception {
		try(FileOutputStream fileOut = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)){
			out.writeObject(singleton);
		}
	}
	
	static BasicSingleton readFromFile(String filename) throws Exception {
		try(FileInputStream fileInput = new FileInputStream(filename);
				ObjectInputStream input = new ObjectInputStream(fileInput)){
			return (BasicSingleton)input.readObject();
		}
	}
}
