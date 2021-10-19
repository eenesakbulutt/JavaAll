package com.syntax.reviewclass3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
	System.out.println("Enter two numbers");	
	Scanner input=new Scanner(System.in);

	
	double number1= input.nextDouble();
	double number2=input.nextDouble();
    System.out.println("Enter the operation");
	char operation=input.next().charAt(0);
	
	
	if(operation=='+') {
		System.out.println(number1+number2);
	}else if(operation=='-') {
		System.out.println(number1-number2);  
	}else if(operation=='*') {
		System.out.println(number1*number2);
	}else {
		System.out.println("Operation not supported");
	}
	
	
	
	
	switch(operation) {
	case '+' :
	System.out.println(number1+number2);
	break;
	
	case '-' :
	System.out.println(number1-number2);
	break;
	case '*' :
	System.out.println(number1*number2);
	break;
	case '/' :
		System.out.println(number1/number2);
		break;
		default:
			System.out.println("Operation not supported");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
