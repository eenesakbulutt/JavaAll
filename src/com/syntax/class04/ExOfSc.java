package com.syntax.class04;

import java.util.Scanner;

public class ExOfSc {

	public static void main(String[] args) {

		
		
		String name = "Serge";
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Please enter your name"); //creating scanner
		
		//capture String values and we stored inside variable value
		
		
		String value=scan.nextLine();  //capturing string value
		System.out.println("Hello" + name);
		
		//capture integer value
		System.out.println("Please enter your age");
		int age= scan.nextInt();
		System.out.println(name+ " is "+ age+ " year old");
		
		
		
		
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
