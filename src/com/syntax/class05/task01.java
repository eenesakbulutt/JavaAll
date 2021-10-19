package com.syntax.class05;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		
	Scanner data = new Scanner(System.in);
	
	System.out.println("Please enter your height?");
	
	
	int inch= data.nextInt();
	
	if(inch<60) {
		System.out.println("short");
	}else if (inch>=60 && inch <=72) {
		System.out.println("medium");
	}else if (inch>72){
		System.out.println("tall");
	}else {
		System.out.println("invalid");
	}
		
		
		
	}

}
