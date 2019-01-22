package com.shs.opps;
/*Programme to demonstrate the working of banking system where we can deposit and withdraw
 * amount from our account.create an account class that has deposit and withdraw() method.*/
public class Account {
	int acc_no;
	String name;
	float amount;
	//method to initialize object
	void insert(int a,String n,float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	}
	//deposit  amount
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"::Deposited");
	}
	//withdraw amount
	void withdraw(float amt){
		if(amount<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"::Withdrawn");
		}
	}
	//check balance
	void checkBalance() {
		System.out.println("Balance is:"+amount);
	}
	//display the values of an object
	void display() {
		System.out.println("Account Holder Information:"+acc_no+" "+name+" "+amount);
	}
	
	
}
