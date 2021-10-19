package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
	
		
		/*
		 * I want to ask where u are from?
		 * based on the country we will define traditional?
		 *
		 */
		
		Scanner in;
		String country, traditionalFood;
		in=new Scanner(System.in);
		
		System.out.println("Where are u from ? ");
		country= in.nextLine();
		
		
		
		switch(country) {
		
		case "USA":
		traditionalFood="burgers";
		    break;
		
		
		case "Afghanistan":
			traditionalFood="qabeli Palaw";
			break;
			
		case "Peru":
			traditionalFood="ceviche";
			break;
			
		case "Italy":
			traditionalFood="pasta";
			break;
			
		case "Ukraine":
			traditionalFood="borsch";
			break;
			
		case "Turkey":
			traditionalFood="borek";
			break;
			default:
			traditionalFood="unknown";
		
		
		}
		
		
		
		System.out.println("You are from "+ country+ " and traditional food is "+ traditionalFood);
		
		
		
	}

}
