package com.syntax.class10;

import java.util.Scanner;

public class ScannerForArray {

	public static void main(String[] args) {
	


		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the size of the Array");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Please enter the numbers");

			numbers[i] = scanner.nextInt();

		}

		System.out.println("***********************");

		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
	}

}
