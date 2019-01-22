package com.shs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("shankar");
		list.add("ravi");
		list.add("shankar");
		list.add("Ajay");
		//traversing through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
