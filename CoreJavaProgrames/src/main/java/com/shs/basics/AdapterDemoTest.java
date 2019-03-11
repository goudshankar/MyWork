package com.shs.basics;

public class AdapterDemoTest extends AdaptarDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterDemoTest adt=new AdapterDemoTest();
		adt.deposit();
		adt.withdraw();
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Money Deposited");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Money WithDrawn");
	}

	@Override
	public void printStmt() {
		// TODO Auto-generated method stub
		System.out.println("printStmt executed");
	}

}
