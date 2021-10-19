package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		
		
	/*
	 * 
	 * Write a program to ask if user got a visa
	 * 
	 * if user got a visa let's ask how long is visa for 
	 * 	if visa is less more than 1 year ---> cool
	 * if less---> u will have to go back in 1 year and to apply again.
	 * 
	 */
		
		
	Scanner scan ;
	String visa;
	int years;
	
	scan=new Scanner(System.in);
	System.out.println("Did u get your visa");	
		
		
	visa=scan.next();
	
	if(visa.equals("yes")) {
		System.out.println("Congrats, how long is your visa for");
		
		years=scan.nextInt();
		
		if(years>1) {
			System.out.println("That is awesome");
		}else {
			System.out.println("You will have to go back in 1 year and to appyl again");
		}
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
