package com.shs.opps;
/*Case2:Rule1:If superclass method declares an exception,
 * then subclass Overriden method can declare same exception or  subclass exception or no exception but can't declare parent exception.
 * */
public class Parent2 {
	void msg() throws Exception {System.out.println("Parent class Method");}
}
