package com.syntax.reviewclass3;

public class LogicalOperator {

	public static void main(String[] args) {
	
		
	/*
	 * Logical operators in Java are && || !
	 * 
	 * 	we can use these operators to put multiple conditions in if blocks
	 */
		

		String day="Tuesday";
		//day.equals("Sunday")
		//"Saturday".equals("Sunday")
		if("Sunday".equals(day)) {
			System.out.println("its weekend");
		}else if(day.equals("Saturday")) {
			System.out.println("its weekend");
		}else {
			System.out.println("its weekday");
		}
		
		if(day.equals("Sunday") || day.equals("Saturday")) {
			System.out.println("its weekend");
		}else {
			System.out.println("its weekday inside the scope of else block");
			System.out.println("its weekday");}
			
		if(day.equals("Sunday") || day.equals("Saturday"))
				System.out.println("its weekend inside the scope of if block");	
				System.out.println("its weekend");
		
		
		
		
		
		
		
	}

}
