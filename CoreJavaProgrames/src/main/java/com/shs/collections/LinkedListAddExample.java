package com.shs.collections;

import java.util.LinkedList;

public class LinkedListAddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("Initial elements of LL:");
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After invoking the add(E e) method:"+ll);
		//adding element at specied index
		ll.add(1, "Gauvrav");
		System.out.println("After invoking the add(int index,E element) method:"+ll);
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Lokesh");
		ll2.add("Manoj");
		//adding 2nd list elements to first list
		ll.addAll(ll2);
		System.out.println("After invoking the addAll(Collection<? extends e>c) method:"+ll);
		//adding an element at first postion
		ll.addFirst("shankar");
		System.out.println("After invoking the addFirst(-) method:"+ll);
		//adding an element at last Position
		ll.addLast("goud");
		System.out.println("After invoking the addLast(-) method:"+ll);
		
	}

}
