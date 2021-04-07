package com.pratap.designpatterns.creational.singleton;
// prefer to use this approach wrt synchronization : double check locking
public class InnerStaticSingleton {

	private InnerStaticSingleton() {}
	
	// inner static class, responsible to create the InnserStaticSingleton object
	private static class Impl {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}
	
	public static InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}
	
}
