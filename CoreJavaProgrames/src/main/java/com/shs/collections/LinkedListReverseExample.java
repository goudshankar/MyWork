package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		//Traversing the list of elements in reverse order
		Iterator itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
