package com.syntax.class07;

import java.util.Scanner;

public class Hw2Class7 {

	public static void main(String[] args) {
		
		
		
	Scanner in=new Scanner(System.in);
	int money;
	System.out.println("Please pay for candy");
	
	do {
		
		money=in.nextInt();
		
		
		if(money>3) {
			
			System.out.println("Please give less money");
		}else if(money<3) {
			System.out.println("Please give more money");
			
			
		}
		
	
		
	}while(money!=3);
	
		
		System.out.println("Please enjoy your candy");
		
		
		
		
		
		
		
		
		
		
		
	}

}
