package com.syntax.class04;

import java.util.Scanner;

public class HW0402 {

	public static void main(String[] args) {
		
		
	//HW02	
		
		
	Scanner data=new Scanner(System.in);	
		
	System.out.println("What is your age?");	

	int age=data.nextInt();
	
	if(age>=18) {
		System.out.println("You are eligible to get a driver licence");
	}else {
		System.out.println("You can get a learner's permit");
	}

	
	
	
	
	}

}
