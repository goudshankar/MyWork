package com.shs.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vector=new Vector<String>();
		vector.add("Amit");
		vector.add("Ashis");
		vector.add("Ayush");
		vector.add("Garima");
		Iterator<String> itr=vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
