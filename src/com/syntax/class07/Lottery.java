package com.syntax.class07;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		
		
	/*
	 * 
	 * 
	 * we have a secret number (any number from 1 till 20)
	 * ask user to guess your secret number
	 * continue guessing a number UNTIL user enter your secret number
	 * once u guessed let's say Congratulations you got it!
	 */
		
		
	Scanner in;
	
	int secretNumber,userNumber;
	
	secretNumber=15;
	
	in=new Scanner(System.in);
	

	do {
	System.out.println("Please guess my secret number from range 1 to 20");
	
	userNumber=in.nextInt();
	
	}while(userNumber!=secretNumber);	
		
		
		
	System.out.println("Congratulations you got it!");	
		
		
		
		
		
		

	}

}
