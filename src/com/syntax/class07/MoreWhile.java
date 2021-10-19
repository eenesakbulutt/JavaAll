package com.syntax.class07;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		
	/*
	 * 
	 * Ask name and age from a user 3 times 
	 * Print name+age
	 * 	
	 */
		
		
	Scanner data;
	String name = null;
	int age = 0;
	
		
	data=new Scanner(System.in);	
	
	
	
	int i=1;
	while(i<=3) {
	
	
		
	System.out.println("Please enter your name");	
	name=data.next();
	
	System.out.println(name+  " Please enter your age");
	age=data.nextInt();

	
	
	System.out.println(name+ " is "+ age + " years old ");
	i++;
	
		
	}	
		
		
	}

}
