package com.syntax.class07;

public class homeworkclass7 {

	public static void main(String[] args) {
		
		
		
	//pls find some of even and odd numbers from 1 to 100	
		
	int sumEven=0;	
	int sumOdd=0;

	for(int i=1; i<=100; i++) {
		
		
		if(i%2==0) {
			
			sumEven+=i;
			
			
			
		}else {
			
			sumOdd+=i;
			
		}
		
		
		
	}
		
	
	System.out.println("Sum of all even number is "+ sumEven);	
		
	System.out.println("Sum of all odd number is "+ sumOdd);	
		
		
		
		
		
		
	}

}
