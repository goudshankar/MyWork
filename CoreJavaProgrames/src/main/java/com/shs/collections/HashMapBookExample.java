package com.shs.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Book> map=new HashMap<Integer,Book>();
		//creating book objects
		Book b1=new Book(101,"LetUsC","YK","BPB",8);
		Book b2=new Book(102,"DC","Foruoz","MCG",7);
		Book b3=new Book(103,"OS","Galvin","Wiley",9);
		//add book objects to hashMap
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		//Traverse the elements from the HashMap
		for(Map.Entry<Integer,Book> m:map.entrySet() ) {
			int key=(int) m.getKey();
			Book b=(Book) m.getValue();
			System.out.println(key+" Details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			
		}
	}

}
