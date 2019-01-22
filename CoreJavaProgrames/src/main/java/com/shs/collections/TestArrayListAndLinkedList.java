package com.shs.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayListAndLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		List<String> al2=new LinkedList<String>();
		al2.add("James");
		al2.add("serena");
		al2.add("Swati");
		al2.add("Junaid");
		System.out.println("ArrayList:"+list);
		System.out.println("LinkedList:"+al2);
		
	}

}
