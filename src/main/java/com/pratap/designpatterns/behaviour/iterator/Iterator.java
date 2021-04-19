package com.pratap.designpatterns.behaviour.iterator;
/**
 * Iterator interface allowing to iterate over values of an aggregate
 * @author 835698
 *
 * @param <T>
 */
public interface Iterator<T> {

	boolean hasNext();
	
	T next();
}
