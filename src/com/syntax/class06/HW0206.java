package com.syntax.class06;

import java.util.Scanner;

public class HW0206 {

	public static void main(String[] args) {

		String grade, level;
		Scanner data = new Scanner(System.in);

		System.out.println("What is your grade? Plese enter the value like A-B-C etc.");

		grade = data.nextLine();

		switch (grade) {

		case "A":
			level = "Excellent";
			break;

		case "B":
			level = "Good";
			break;

		case "C":
			level = "Average";
			break;
		case "D":
			level = "Bad";
			break;
		default:
			level = "Unvalid";

		}

		System.out.println("Grade "+ grade + " was entered by a user and the result of this grade is  "+ level+ ".");
		
		
	}

}
