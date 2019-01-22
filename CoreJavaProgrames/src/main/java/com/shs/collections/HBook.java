package com.shs.collections;

import java.util.HashSet;

public class HBook {
	
	int id;
	String name,author;
	int quantity;
	
	
	public HBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HBook(int id, String name, String author, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}

		//toString
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<HBook> hset=new HashSet<HBook>();
		HBook b=new HBook();
		HBook b1=new HBook(101,"LetUs C","YK",3);
		HBook b2=new HBook(102,"OS","shankar",8);
		hset.add(b1);
		hset.add(b2);
		System.out.println(hset);
		
	}

	@Override
	public String toString() {
		return "HBook [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
	}

}
