package com.syntax.class06;

import java.util.Scanner;

public class HW0306WAY2 {

	public static void main(String[] args) {
		
		
		int num1,num2;
		char operator;
		int result=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		
		 num1=input.nextInt();
		
	     num2= input.nextInt();
		
		System.out.println("Please enter your operator like (+,-,*,/)");
		
		 operator=input.next().charAt(0);
		 		
		switch(operator){
			
		case '+' :
			result= (num1+num2);
			break;
			
		case '-' :
			result=(num1-num2);
			break;
		case '*' :
			result=(num1*num2);
			break;
		case'/':
			result=(num1/num2);
			break;
			
		}
			
	System.out.println("Based on your entry with the operator ("+operator+") Your result is "+ result+ ".") ;	
		
	}

}
