package com.shs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("mobile");
		list.add("laptop");
		list.add("tv");
		list.add("shankar");
		list.add("1");
		list.add("2");
		list.add("3");
		//traversing the arrayList through for loop
		System.out.println("Traversing the arrayList through for loop:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//Traversing an arrayList through for-each loop
		System.out.println("Traversing the arrayList through for-each loop:");
		for(String obj:list){
			System.out.println(obj);
		}
		//Traversing an arrayList through forEach() method
		System.out.println("Traversing the arrayList through forEach() method:");
		list.forEach(a->{System.out.println(a);});
		//Traversing an arrayList through forEachRemaining() method
		System.out.println("Traversing the arrayList through forEachRemaining() method:");
		Iterator<String> itr1=list.iterator();
		itr1.forEachRemaining(a->{System.out.println(a);});
		//Traversing an arrayList through Iterator 
		System.out.println("Traversing the arrayList through Iterator Interface:");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//traversing through ListIterator
		System.out.println("Traversing the arrayList through ListIterator:");
		ListIterator<String> listItr=list.listIterator(list.size());
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}
	

}
