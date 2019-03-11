package com.shs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DuplicateEleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("1one");
		list.add("2two");
		list.add("3three");
		List<Integer>list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
//		list.add("one");
		/* Remove duplicate elements from ArrayList
		 * System.out.println(list);
		Set<String> linkedHashSet=new LinkedHashSet<String>(list);
		list.clear();
		System.out.println(linkedHashSet);*/
		/* reversing an ArrayList and descending order of ArrayList*/
		Iterator<String> itr=list.iterator();
		Collections.reverse(list);
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		Comparator cmp=Collections.reverseOrder();
		Collections.sort(list1, cmp);
		Iterator<Integer> itr2=list1.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
	}

}
