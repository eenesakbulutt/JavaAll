package com.syntax.class10;

public class Task2DArray {

	public static void main(String[] args) {
		// TASK1

		String[][] names = {

				{ "Mr", "Mrs", "Ms", "Miss" },

				{ "Smith", "Obama", "Jackson", "Jordan" }

		};

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][1]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][3]);

		
	System.out.println("------------------------------------------------");	
		
		
		//how to access all elements
		
		
		for(int r=0; r<names.length;r++) {   //outer loop iterates over rows
			
			for(int c=0; c<names[r].length; c++) {  //inner loops iterates over columns
				
				
				System.out.print(names[r][c]+" ");
				
			}
			
			
			System.out.println();
			
			
		}
		
		
		System.out.println("---------FOR EACH LOOP ILE------------------------------");
		
		
		
		for(String[]arr:names) {
		
		for(String a:arr) {
			System.out.print(a+" ");
		}
		
		
	System.out.println();

		}	
		
	
	}
}
     
       