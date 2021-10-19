package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
	//TASK
		
	/*
	 * Create an array on double values using scanner
	 * Calculate the sum of all stored elements in that array.
	 * 
	 */
		
		
		Scanner scan=new Scanner(System.in);
		
		double []array;
		
		double sum=0.0;
		
		
		System.out.println("How many elements do you want to store ?");
		
		int size= scan.nextInt();
		
		System.out.println("Plese enter numbers");
		
		
		array=new double[size];
		
	
		for(int i=0;i<size;i++) {
			array[i]=scan.nextDouble();
			sum=sum+array[i];
		}
		
		
		
		System.out.println("Total: "+ sum);
		
		
		
	}

}
