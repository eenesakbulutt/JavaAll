package com.syntax.class03;

public class MoreIfExamples {

	public static void main(String[] args) {
		
	double a=30;
	double b=20;
	
	if(a==b) { //condition always must be a boolean value 
		System.out.println("Numbers are equal ");
		System.out.println("My numbers are twins");
	} else {
		System.out.println("Numbers are not equal");
		System.out.println("Numbers are not twins");
		System.out.println("Chilling with numbers");
	}
		
		
	System.out.println("----------------------");	
		
		
		boolean isBreakTime=true;
	
		//if it is a break time ------. I ll get a coffee
		//otherwise I ll focus on th class
		
		
		if(isBreakTime==true) {
			System.out.println("I am getting my coffee");
		}else {
			System.out.println("I am focusing on the class");
		}
		
		
		/*
		 * 
		 * if u a re hungry ---->I will go eat
		 * otherwise: I will go have a tea
		 */
		
		boolean isHungry=true;
		
		if(isHungry) {
			System.out.println("I will go eat");
		} else {
			System.out.println("I will go have a coffee");
		}
		
		
		
		
		
		
		
		
		
	}

}
