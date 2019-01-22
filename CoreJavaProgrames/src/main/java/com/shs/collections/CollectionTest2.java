package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Ravi");
		llist.add("Vijay");
		llist.add("Ravi");
		llist.add("Ajay");
		Iterator<String> itr=llist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
