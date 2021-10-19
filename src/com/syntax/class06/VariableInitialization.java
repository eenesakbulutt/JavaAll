package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {
	
		/*
		 * ask user to enter name and age 
		 * based on age define who is user
		 * if age is from 0-3---> baby
		 * if age is from 3-5----> toddler
		 * if age is from 5-12--->kid
		 * if age is from 12-19---->teenager
		 * if age is from 19-65---->adult
		 * if 65+ ----> senior
		 */
		
		
        Scanner scc =new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=scc.nextLine();
		
		
		System.out.println("Please enter your age");
		int age=scc.nextInt();
		
		String whoAreYou;
		
		
		if(age>=0 && age<3) {
			 whoAreYou="baby";
			
		}else if(age>3 && age<6) {
			whoAreYou=" toddler ";
			
		}else if(age>6 && age<13) {
			whoAreYou= " kid ";
			
		}else if(age>=13 && age<20) {
			whoAreYou=" teenager ";
			
		}else if(age>=20 &&age<65) {
			whoAreYou=" adult ";
		}else if(age>65) {
			whoAreYou=" senior ";
			
		}else {
			whoAreYou=" Invalid ";
		}
	
	
	System.out.println(name+"you are"+ whoAreYou );
	
	
	}
}
