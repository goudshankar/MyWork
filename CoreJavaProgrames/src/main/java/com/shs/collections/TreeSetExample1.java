package com.shs.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Ravi");
		tset.add("Vijay");
		tset.add("Ajay");
		//traversing the elements from the treeSet
		Iterator<String> itr=tset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
