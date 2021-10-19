package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		
	boolean vaccine= true;
	
	boolean secondDose= false;
	
	if (vaccine) { //yes
		
		System.out.println("Let's check how many doses u got");
		
		if (secondDose) {
			
		System.out.println("You are fully vaccinated");
			
		}else { 
			System.out.println("U ll need to get  2nd dose.");
			
		
				
			
		}
		
	System.out.println("End of if block");		
		
	
	}
	
	
	System.out.println("-------------ANOTHER EXAMPLE--------");
	
	
	/*
	 * 
	 * Every Friday is movie day
	 * If it is the 13th ----> U want to watch a scary movie
	 */
	
	
	int day=29;
	boolean isFriday=true;
	
	if(isFriday) {
		System.out.println("I am going to watch a movie");
		
	if(day==13) {
		System.out.println("Yay, I am watching scary movie");
	}else { 
		System.out.println("I am  watching whatever is popular");
	}
		
		
		
	}else {
		System.out.println("I am going to study");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	System.out.println("End of the code");	
		
		
	
	
		
	}

}
