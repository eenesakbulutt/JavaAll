package com.syntax.class07;

import java.util.Scanner;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
	
		
	/*
	 * 
	 * I want to print multiplication table
	 * 
	 * 
	 * 1X1=1;
	 * 1X2=2
	 * 1X10=10;
	 * 
	 */
	
		
		Scanner data=new Scanner(System.in);
		int num;
		System.out.println("Which number u want to enter");
		num=data.nextInt();
		
	
	
	for(int i=1; i<=10; i++) {
		
	System.out.println(num+" X "+i+" = "+num*i);
			
		
	}
		
		
	
	System.out.println("What is the output");
	
	int sum=0;
	
	for(int i=1; i<=5; i++) {
		
	sum=sum+i;
	
	System.out.println(sum);

	}
		
		
	System.out.println("What is the output?");
	
	
	sum=0;
	
	for(int i=0; i<=40; i+=10) {
		
		sum+=i;
		System.out.println(sum);
		
	}
	
	
	
	
	
	
		
		
		
	}

}
