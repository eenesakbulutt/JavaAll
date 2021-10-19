package com.syntax.class04;

import java.util.Scanner;

public class HW0401 {

	public static void main(String[] args) {
	
		
	//HW01
		
	Scanner amount = new Scanner(System.in);	
		
	System.out.println("How much you need for loan");	
		
	int loan= amount.nextInt();
	
	
	
	if(loan<=200000) {
		System.out.println("Lend it");
	}else {
		System.out.println("Reject the client");
	}
	
	
		
		
		

	}

}
