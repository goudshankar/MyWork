package com.shs.bankingproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Scanner;

public class CustomerAccount implements RandomAccess {



	public static double getRandomNumber() {
		double min = 1000;
		double max = 9999;
		double x = (int) (Math.random() * ((max - min) + 1)) + min;
		return x;
	}

	public static void deposit(int amount,Customer cust) {
		System.out.println("Amount is Deposited  to  Acc:9940 xxxx xxxxx xx47:");
		amount = amount + cust.getBal();
		cust.setBal(amount);
		System.out.println("Available Balance is:"+cust.getBal());
	}

	public static void withdraw(int amount,Customer cust) {
		System.out.println("Amount is withdraw from Acc:9940 xxxx xxxxx xx47:");
		amount =  cust.getBal()-amount ;
		cust.setBal(amount);
		System.out.println("Available Balance is:"+cust.getBal());
	}

	public static void checkBalance(Customer cust) {
		System.out.println("Available Balance is::" + cust.getBal());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		List<Customer> arrayList=new ArrayList<Customer>();
		Scanner scn=new Scanner(System.in);
		System.out.println("Please Register the  Customer Details");
		Customer cust=new Customer();
		boolean flag=false;
		
		//if(newCustomer.equalsIgnoreCase("Y")) {
			System.out.println("Enter how many customers you want  register:");
			String i=scn.next();
				for(int index=0;index<Integer.parseInt(i);index++) {
				System.out.println("Enter name:");
				String cname=scn.next();
				System.out.println("Enter dob:");
				String dob=scn.next();
				System.out.println("Enter bal:");
				String bal=scn.next();
				Customer customer=new Customer();
				customer.setId((int)getRandomNumber());
				customer.setCname(cname);
				customer.setDob(dob);
				customer.setBal(Integer.parseInt(bal));
				arrayList.add(customer);
			}
				int count=1;
				
					for (Customer cust1 : arrayList) {
						System.out.println("Customer  Details"+"\n");
						System.out.println("CustomerID	:"+maskNumber(String.valueOf(cust1.getId()),"#xx#")+"\n");
						System.out.println("CustomerName	:"+cust1.getCname()+"\n");
						System.out.println("CustomerDOB	:"+cust1.getDob()+"\n");
						System.out.println("CustomerBalance	:"+cust1.getBal()+"\n");
						cust.setBal(cust1.getBal());
						count++;
					}
					
			scn=new Scanner(System.in);
			
			Map<Integer,String> map=new HashMap<Integer,String>();
			map.put(1,"For Deposit :");
			map.put(2,"For Withdraw:");
			map.put(3,"For  Balance Check:");
			map.put(4,"Exit");
			
			for(Map.Entry<Integer,String> m1:map.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
			int key=m1.getKey();
			
			}
			
			for(;;) {
				System.out.println("\n"+"Enter Options::");
				int opt=scn.nextInt();
				int amt=cust.getBal();
				switch(opt) {
				case 1:
					System.out.println("Enter Amount:");
					amt=scn.nextInt();
					deposit(amt,cust);
					continue;
				case 2:
					System.out.println("Enter Amount:");
					amt=scn.nextInt();
					withdraw(amt,cust);
					continue;
				case 3:
					checkBalance(cust);
					continue;
				default:
						System.out.println("Exit");
						break;
				}
				break;
			}
		//}
		
		}
		
	
	   public static String maskNumber(String number, String mask) {
		   
		   //   int index = 0;
		      StringBuilder masked = new StringBuilder();
		      for (int i = 0; i < mask.length(); i++) {
		         char c = mask.charAt(i);
		         if (c == '#') {
		            masked.append(number.charAt(i));
		         } else if (c == 'x') {
		            masked.append(c);
		      //      index++;
		         } else {
		            masked.append(c);
		         }
		      }
		      return masked.toString();
		   }
}
