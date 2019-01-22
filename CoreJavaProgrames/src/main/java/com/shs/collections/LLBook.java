package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLBook {
	int id;
	String name,author,publisher;
	int quantity;
	
	public LLBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LLBook(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	//tostring
	
	
	public static void main(String[] args) {
		//creating list of books
		List<LLBook> b=new LinkedList<LLBook>();
		//creating books
		LLBook b1=new LLBook(101,"LC","YK","BPB",8);
		LLBook b2=new LLBook(102,"DS","Mars","MCG",4);
		LLBook b3=new LLBook(103,"OS","winers","Orelly",5);
		//add list of books to list
		b.add(b1);
		b.add(b2);
		b.add(b3);
		/*//traversing the list of elemets
		Iterator<LLBook> itr=b.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		System.out.println(b);
	}

	@Override
	public String toString() {
		return "LLBook [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
}
