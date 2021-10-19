package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		
	/*
	 * 
	 * I want to say hello 5 times
	 * for(initialization; condition;increment/decrement){
	 * code to be repeated
	 * }
	 */
		
	//Example
		
	for(int i=1;  i<=5; i++) {
		
		
		System.out.println("Hello");
		
	}
		
	
	System.out.println(" WANT TO PRINT NUMBERS FROM 1 TO 10");
		
		
		
	for(int i=1; i<=10;  i++) {
		
		System.out.println(i);
		
	}
		
		
	
	System.out.println("WANT TO PRINT NUMBERS FROM 20 TO 10");
	
	for(int i=20; i>=10; i--) {
		
		System.out.println(i+" ");
		
	}
	
	
	System.out.println("     WANT TO PRINT EVEN NUMBERS FROM 10 TO 100     ");
	
	for(int i=10; i<=100; i+=2) {
		
		
		if(i%2==0) {
		System.out.print(i+ " ");
	}
	
	}	
	
	
	
	
	System.out.println("---WANT TO PRINT EVEN NUMBERS FROM 10 TO 100");
	
	
	for(int i=1; i<=50; i+=10) {
		System.out.println(i);
	}
	
	

	
		
	}

}
