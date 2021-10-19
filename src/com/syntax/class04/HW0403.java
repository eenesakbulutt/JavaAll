package com.syntax.class04;

import java.util.Scanner;

public class HW0403 {

	public static void main(String[] args) {
		
	
	//HW03	
		
	Scanner data=new Scanner(System.in);	
		
	System.out.println("What is your city");	
		
	String city= data.nextLine();
	
	System.out.println("What is the temperature in your city");
	
	float temp=data.nextFloat();
	
	char a = 'C';
	System.out.println("Your city's temperature is " + ((temp-32)/(1.8))+ " "  + a );
		

		

	}

}
