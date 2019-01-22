package com.shs.multithreading;

public class InterThreadCommunication_Customer {
		int amount=0;
		synchronized void withdraw(int amount) {
			if(this.amount<amount) {
				System.out.println("less than amount:wait for deposit");
				try {
					wait();
				}
				catch(Exception e) {}
			}
			this.amount-=amount;
			System.out.println("Amount is widrawn available balance is:"+this.amount);
		}
		synchronized void deposit(int amount) {
			System.out.println("Customer is going to deposit");
			this.amount+=amount;
			System.out.println("Amount is deposited as:"+this.amount);
			notify();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final InterThreadCommunication_Customer itcc=new InterThreadCommunication_Customer();
		new Thread() {
			public void run() {
				itcc.withdraw(2000);
			}
		}.start();
		//2nd thread
		new Thread() {
			public void run() {
				itcc.deposit(10000);
			}
		}.start();
		
	}

}
