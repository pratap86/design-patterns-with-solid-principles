package com.pratap.designpatterns.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

public class DynamicLoggingProxyUtil {

	@SuppressWarnings("unchecked")
	  public static <T> T withLogging(T target, Class<T> itf)
	  {
	    return (T) Proxy.newProxyInstance(
	      itf.getClassLoader(),
	      new Class<?>[] { itf },
	      new LoggingHandler(target));
	  }
}
