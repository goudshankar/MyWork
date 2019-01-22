package com.shs.opps;

public interface InterfaceDrawableDefaultMethod {
	void draw();
	default void print() {
		System.out.println("Printing is default method");
	}
}
