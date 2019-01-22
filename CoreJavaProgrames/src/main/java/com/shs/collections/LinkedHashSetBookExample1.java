package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetBookExample1 {
	int id;
	String name,author,publisher;
	int quantity;
	//paramConstructor
	public LinkedHashSetBookExample1(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	//toString(-)
	/*@Override
	public String toString() {
		return "LinkedHashSetBookExample [id=" + id + ", name=" + name + ", author=" + author + ", publisher="
				+ publisher + ", quantity=" + quantity + "]";
	}*/
}
  class LinkedHastSetBookEg{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Book> set=new LinkedHashSet<Book>();
		//creat book instances
		Book b1=new Book(101,"LetUsC","YK","BPB",5);
		Book b2=new Book(102,"DC","Forouzan","MCG",6);
		Book b3=new Book(103,"OS","Galvin","wiley",8);
		//add book objects to linkedHashSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		//traversing the LinkedHashSet elements
		/*Iterator<Book> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		for(Book b:set)
			System.out.println(b);
	}
	}



