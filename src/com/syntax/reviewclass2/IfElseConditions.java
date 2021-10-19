package com.syntax.reviewclass2;

import java.util.Scanner;

public class IfElseConditions {

	public static void main(String[] args) {
		
		
	String storedUserName="Sharif";
	
	
	String storedPassword="pass123";
	
	Scanner scanner=new Scanner(System.in);
	
	
	System.out.println("Please enter your UserName");
	
	String userName=scanner.nextLine();
	
	
	System.out.println("Please ener your Password");
	
	String password=scanner.nextLine();
	
	
	// == operator only works with primitive data types
	
	//for non primitive data types we should use equals method
		
		
		
	if(storedUserName.equals(userName)) {
		
		System.out.println("Correct username");
	
    if(storedPassword.equals(password)) {
    	
    	
    	System.out.println("Password is also correct");
    }else {
    	
    	
    	System.out.println("Username is correct but password is not");
    }
		
		
		
		
		
	
	
	}else {
		
		System.out.println("Username is not correct");
		

	}
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		

	}

}
