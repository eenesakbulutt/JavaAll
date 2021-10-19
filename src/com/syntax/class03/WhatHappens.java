package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
		
		
	// int i= 1.99;	 error
		
	
	int i= (int) 1.99; 	     //narrowing or explicit casting
	System.out.println(i);	
		
		
	double d = 1000;       //widening  implicit
	System.out.println(d);  //1.0
	
	//Casting in java	
		
		
	int num= 20;
	int num1=3;
	
	System.out.println(num/num1);  //we divide 2 int values and they do not have decimals
	
	double num2=20;
	double num3=3;  //conversion from int to double happens
	
	System.out.println(num2/num3);  //dividing two double value
		
	//we divide 2 int values and only then result are storing in double type	
	int n1=20; 
	int n2= 3;
	double dd= n1/n2;
	
	System.out.println(dd);  //6.0
		
		
	long number=(long) 500.4444;
	
		
		
		
		
		
		
		
		
		
		

	}

}
