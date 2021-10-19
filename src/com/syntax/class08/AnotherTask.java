package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask {

	public static void main(String[] args) {
		
		
		
		
	Scanner input=new Scanner(System.in);	
	
	
	
	int start;
	int end;
	
	int evenSum=0;
	int oddSum=0;
	
	System.out.println("Please enter your starting number");
	
	start=input.nextInt();
	
	System.out.println("Please enter your  ending number");
	end=input.nextInt();
	
	
	
	for(int i=start; i<=end; i++) {
		
		
	if(i%2==0) {
		
		evenSum+=i;
	}else {
		
		oddSum+=i;
	}
		
			
		
	}

	
		
	System.out.println("Sum of even numbers from range "+ start+ " till "+ end+ " equals to " +evenSum);	
	System.out.println("Sum of even numbers from range " +start+ " till "+ end+ " equals to "+ oddSum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
