package com.syntax.class05;

import java.util.Scanner;

public class HW0305 {

	public static void main(String[] args) {

		Scanner data;

		int num1, num2, num3, largest;

		data = new Scanner(System.in);

		System.out.println("Please enter three distinct numbers");

		num1 = data.nextInt();
		num2 = data.nextInt();
		num3 = data.nextInt();

		if(num1>num2 && num1>num3) {
			largest=num1;
			
		}else if(num2>num1 && num2>num3) {
			largest=num2;
		}else {
			largest=num3;
		}
		
		System.out.println("The largest number is "+ largest);
		
	}
	
}