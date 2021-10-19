package com.syntax.class09;

public class HwClass09 {

	public static void main(String[] args) {

		// HW1
		String[] cars= {"Mercedes","Hyundai", "BMW", "Porsche", "Toyota", "Tofas"};
			
		for(int a=0; a<cars.length; a++) {
				
			System.out.println(cars[a]);
		}
			
			System.out.println("-----advance for loop/ enhanced for loop/for each loop");
			
			//advance for loops used for only collections and arrays
			
			for(String car:cars) {
				System.out.println(car);
			}
		
		// HW2
			System.out.println("-------------HW2-----------------");
		String [] animals={"Elephant", "Rabbit", "Tiger","Goril", "Wolf","Fox"};	
			
			
		for(int i=0;i<animals.length;i++) {	
			System.out.println(animals[i]);
		}
			
		System.out.println("---USING ENHANCED FOR LOOP --------");
			
			
		for(String annames:animals) {	
			System.out.println(annames);
		}
			
		

		// HW3: Create an array to store double values and then print those in reverse
System.out.println("-----------------HW3-----------------------------");
		double[] numbers = { 10.22, 15.2, 1.99, 23.99 };
		// for(int a=0; a<=numbers.length-1;a++) {
		// System.out.println(numbers[a]); //normally
		// }

		for (int a = numbers.length - 1; a >= 0; a--) {
			System.out.println(numbers[a]);

		}

		// HW4: Create an array on integers and calculate the sum of all elements in an
		// array.
System.out.println("--------------------HW4----------------------------");
		int[] arr = { 2, 88, 74, 1, 96, 23, 89 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}

		System.out.println("Total= " + sum);

		System.out.println("----------SUM USING ENHANCED FOR LOOP-------");

		sum = 0;

		for (int num : arr) {
			sum += num;
		}

		System.out.println("Total=" + sum);

		
		//HW5
		System.out.println("------------------HW5--------------------");
		/*
		 * 
		 * From an array of integer elements find the largest one.
		 * 
		 */
		
		int[]num= {10,20,98,40,240};
		
		int largest=0;
		int smallest=0;
		for(int i=1; i<num.length;i++) {
			
			
			if(num[i]>largest) {
			largest=num[i];	
				
			}
		}
		
		
		
		System.out.println(largest);
		
		
		
		
		
	}

}
