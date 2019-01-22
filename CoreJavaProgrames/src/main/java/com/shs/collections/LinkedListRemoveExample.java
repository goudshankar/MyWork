package com.shs.collections;

import java.util.LinkedList;

public class LinkedListRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
		System.out.println("Initial list of elements:"+ll);
		//removing the specified element from the list
		ll.remove("Vijay");
		System.out.println("After invoking the remove(E e) method:"+ll);
		//Removing the element on the basis of specific position
		ll.remove(0);
		System.out.println("After invoking the remove(int index) method:"+ll);
		
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");
		//adding 2nd element list to 1st list
		ll.addAll(ll2);
		System.out.println("After invoking the addAll() method"+ll);
		//Removing all the new elements from the list
		ll.removeAll(ll2);
		System.out.println("After invoking the removeAll() method"+ll);
		//removing the firstOccurance of the list
		ll.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking the removeFirstOccurrence() method:"+ll);
		//removing the last Occurrence of the list
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking the removLastOccurrence() method:"+ll);
		//removing all the elements of the list
		ll.clear();
		System.out.println("After invoking the clear() method:"+ll);
	}

}
