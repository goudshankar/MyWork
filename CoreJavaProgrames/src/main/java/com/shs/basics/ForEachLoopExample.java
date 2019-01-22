package com.shs.basics;

import java.util.Date;

public class ForEachLoopExample {  
public static void main(String[] args) {  
    //Using Label for outer and for loop  
	int counter = 0;
	
	       for (int i = 0; i <= 10; i++) {
    	  //start:
          for (int j = 0; j <= 10; j++) {
        	  System.out.println(new Date(System.currentTimeMillis()));
             if (i == 0)
            	 break;// start;
            	 //continue start;
          }
          counter++;
          break;
       }
   
	
	
    System.out.println(counter);
}  
}  