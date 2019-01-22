package com.shs.collections;

import java.util.HashSet;

public class HashSetBookExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> hset=new HashSet<Book>();
		//creating book instances
		Book b1=new Book(101,"LetUsC","YK","BPB",4);
		Book b2=new Book(102,"DC","Ferouzon","MC",5);
		Book b3=new Book(103,"OS","Galvin","wiley",7);
		//add book instances to hashSet
		hset.add(b1);
		hset.add(b2);
		hset.add(b3);
		//traversing the elements from the hashSet
		for(Book b:hset) {
			System.out.println(b);
		}
	}
}
