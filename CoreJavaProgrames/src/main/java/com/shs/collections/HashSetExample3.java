package com.shs.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Ajay");
		alist.add("Vijay");
		alist.add("Ravi");
		HashSet<String> hset=new HashSet<String>(alist);
		hset.add("ramu");
		//traversing the elements from the hashSet
		//hset.remove("ramu");
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
