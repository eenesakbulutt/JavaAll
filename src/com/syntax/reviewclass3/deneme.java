package com.syntax.reviewclass3;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		
		
		Scanner data;
		int age;
		String canSituation = null;


		data=new Scanner(System.in);
		System.out.println("Enter the age of Child");

		age=data.nextInt();

		switch(age){

		case 1:
		canSituation="Talk";
		break;

		case 2:
			canSituation="Talk";
		break;

		case 3:
			canSituation="Talk";
		break;

		case 4:
			canSituation="Talk";
		break;

		default:
		System.out.println("I don't know how old you are");
		break;



		}
		System.out.println("You can "+ canSituation);
	}

}
