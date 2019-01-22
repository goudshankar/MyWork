package com.shs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortListCollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("viru");
		list.add("sachin");
		list.add("virat");
		list.add("rohit");
		//sort the list collection
		Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		//sort in reverse order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse order:"+list);
		//sort wrapper class objects
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(204));
		al.add(Integer.valueOf(203));
		//sort the Collections using sort() method
		Collections.sort(al);
		//traverse the elements from al
		Iterator itr1=al.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		//sort the elements in reverse order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Reverse Order:"+al);
		
		
	}

}
