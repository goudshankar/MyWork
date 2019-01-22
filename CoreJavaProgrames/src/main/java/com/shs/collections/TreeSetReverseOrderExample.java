package com.shs.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetReverseOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Vijay");
		tset.add("Ravi");
		tset.add("Ajay");
		//traversing the elements in reverse order
		Iterator<String> itr=tset.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
