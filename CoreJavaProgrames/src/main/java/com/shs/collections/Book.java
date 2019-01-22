package com.shs.collections;

public class Book {
	int id;
	String name,author,publisher;
	int quantity;
	//0-param constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id; 
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
}
