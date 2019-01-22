package com.shs.collections;

/**
 * @author shankar
 *
 * @param <T>
 */
public class MyGen<T> {
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
	@Override
	public String toString() {
		return "MyGen [obj=" + obj + "]";
	}
 
}
