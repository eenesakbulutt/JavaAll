package com.syntax.class05;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		
		
		Scanner data =new Scanner(System.in);
		
		
		
		System.out.println("Please enter day");
		
		
		int day =data.nextInt();
		
		
		if(day>=1 && day <=5) {
			System.out.println("It is a weekday");
		}else if(day>=6 && day<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
		
	}

}
