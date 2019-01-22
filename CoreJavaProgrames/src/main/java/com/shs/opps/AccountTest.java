package com.shs.opps;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Account class object
		Account a1=new Account();
		a1.insert(832345,"Ankit",1000);
		a1.display();
		//call deposit method and check balance
		a1.deposit(40000);
		a1.checkBalance();
		System.out.println("===================");
		//call withdraw method and check balance
		a1.withdraw(15000);
		a1.checkBalance();
		System.out.println("===================");
		
	}

}
