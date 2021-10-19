package com.syntax.class04;

public class DonorTask3 {

	public static void main(String[] args) {

		int age = 17;
		double weight = 120;

		if (age >= 18) {
			System.out.println("Eligibile to donate");

			if (weight > 100) {
				System.out.println("You can donate");
			} else {
				System.out.println("u can not donate");

			}

		} else {

			System.out.println("You are not eligible for donation");
		}

	}

}
