package com.shs.collections;

import java.util.ArrayList;

public class ArrayListRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("mobile");
		al.add("laptop");
		al.add("TV");
		System.out.println("Initial arrayList:"+al);
		//remove an element from arraylist
		al.remove("TV");
		System.out.println("After invoking remove(E e) method:"+al);
		//remove specied index 
		al.remove(1);
		System.out.println("After invoking remove(int index) method:"+al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("bike");
		al2.add("car");
		al2.add("bus");
		//add al2 to arrayList
		al.addAll(al2);
		System.out.println("After adding al2 to al"+al);
		//removeAll specified elements from the list
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method:"+al);
		//add some more elements
		al.add("laptop");
		al.add("TV");
		al.add("radio");
		/*//remove if radio is exist
		al.removeIf(str->str.contains("radio"));
		System.out.println("After invoking the removeIf(-) method:"+al);
		//remove all the elements from the arrayList
		
*/		System.out.println(al);
al.clear();
System.out.println(al);
	}

}
