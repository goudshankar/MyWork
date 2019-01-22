package com.shs.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> nmap=new TreeMap<Integer,String>();
		nmap.put(100,"shankar");
		nmap.put(101,"Ramesh");
		nmap.put(103,"Ashok");
		nmap.put(104,"prabhu");
		System.out.println(nmap);
		System.out.println("Reverse Map:"+nmap.descendingMap());
		System.out.println("HeadMap:"+nmap.headMap(100, true));
		System.out.println("subMap:"+nmap.subMap(100, true,102, false));
		
	}

}
