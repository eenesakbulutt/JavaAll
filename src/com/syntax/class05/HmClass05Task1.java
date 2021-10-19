package com.syntax.class05;

import java.util.Scanner;

public class HmClass05Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int q, m, f;
		int avg;
		char grade;

		System.out.println("Please enter your quiz score");
		q = input.nextInt();
		System.out.println("Plese enter your midterm score");
		m = input.nextInt();
		System.out.println("Please enter your final score");
		f = input.nextInt();
		avg = (q + m + f) / 3;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 70 && avg < 90) {
			grade = 'B';
		} else if (avg >= 50 && avg < 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
	}

}
