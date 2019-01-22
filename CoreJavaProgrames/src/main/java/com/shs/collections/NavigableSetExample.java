package com.shs.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set =new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		/*Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());*/
		System.out.println("InitialSet:"+set);
		System.out.println("ReverseSet:"+set.descendingSet());
		System.out.println("HeadSet:"+set.headSet("C",true ));
		System.out.println("SubSet:"+set.subSet("A",true, "C", true));
		System.out.println("TaileSet:"+set.tailSet("D",true));
	}

}
