package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
		//TASK 1
		
		
		for(int i=1; i<=50; i++) {
			
			if(i%3==0) {
				continue;				
			}
			
			System.out.print(i+" ");	
			
		}
		
		//TASK 2
		
		String answer;
		
		Scanner data=new Scanner(System.in);
		
		do {
			
			System.out.println("Apply for a credit card?");
			answer=data.nextLine();
			if(answer.equalsIgnoreCase("yes")) {
				
				break;
				
			}
			
			
			
		}while(!answer.equals("yes"));
		
		
		
		System.out.println("Congrats on selecting credit card!");
		
	
		

		
	}

}
