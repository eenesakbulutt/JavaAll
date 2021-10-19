package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask2 {

	public static void main(String[] args) {
		
		
	
//BUNU KENDIM YAPTIM.		
		
/*
 * Write a program to ask a user to enter item they want	
 * to buy and the price of that item. Every time user
 * enters money, accumulate the amount and tell the
 * user how much is left to pay off. If user give more
 * money program should return a change. Whenever a
 * user done with payments program should say “Thank
 * you for shopping!”	
 */
		
		
		
Scanner data=new Scanner(System.in);

		
	String item;
	
	double price, money,more, total=0, change;
	
	
	System.out.println("What item do you want to buy?");	
	item=data.nextLine();
	
	
	System.out.println("What is the price for this item?");
	price=data.nextDouble();
	
	
	
	
		
	do {
		
		
		System.out.println("Please pay for the item ");
		
		money=data.nextDouble();
		
		
		total+=money;
		
		
		if(total>price) {
			change=total-price;
			System.out.println("Here is your change "+ change);
			break;
		}else if (total<price) {
			more=price-total;
			System.out.println("Please give more "+ more);
		}else {
			System.out.println("That is exact amount");
		}
		
		
		
	}while(total!=price);
	
	
	
	
	System.out.println("Thank you for shopping");	
		
		

	}

}
