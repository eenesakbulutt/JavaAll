package com.syntax.class06;

import java.util.Scanner;

public class HW0306WAY1 {

	public static void main(String[] args) {
		
	//USING IF STATEMENT
		int num1,num2;
		Scanner input=new Scanner(System.in);
		
		String operator;
		
		int result=0;
		System.out.println("Please enter two numbers");
		
		num1=input.nextInt();
		num2=input.nextInt();
		
		System.out.println("Please enter operator that you want to use (+,-,*,/)");
		
		operator=input.next();
		
	if(operator.equals("+")) {
		result= (num1+num2);
		
	}else if(operator.equals("-")) {
		result=(num1-num2);
	}else if(operator.equals("*")) {
		result= (num1*num2);
}else if(operator.equals("/")) {
	result=(num1/num2);
}else {
	System.out.println("invalid");
}
		
		
		
		
		
	System.out.println("Based on your entry wıth the operator " + " Your result is "+ result+ " .");	
		
		
		
		
		
		
		
	}

}
