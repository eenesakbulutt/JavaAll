package com.syntax.class05;

import java.util.Scanner;

public class HW0205 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		String month;
		System.out.println("Please enter your birth month's name");
		month=input.nextLine();
		
	if(month.equals("January") || month.equals("February") || month.equals("March")){
		System.out.println("You were born in winter season");
	}else if(month.equals("April") || month.equals("May") || month.equals("June")) {
		System.out.println("You were born in spring season");
	}else if(month.equals("July") || month.equals("August") || month.equals("September")) {
		System.out.println("You were born in summer season");
	}else if(month.equals("October") || month.equals("November") || month.equals("December")) {
		System.out.println("ou were born in fall season");
	}
		
		
		
		
		
		
		
	}

}
