package com.syntax.class05;

import java.util.Scanner;

public class HW105 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int quiz, mid,fin, avg;
	System.out.println("Please enter you quiz , midterm and final score");
	quiz=scan.nextInt();
	mid=scan.nextInt();
	fin=scan.nextInt();
	avg=(quiz+mid+fin)/3;
	
	if(avg>=90) {
		System.out.println("Grade A");
	}else if(avg>=70 && avg<90) {
		System.out.println("Grade B");
	}else if(avg>=50 && avg<70) {
		System.out.println("Grade C");
	}else if(avg<50) {
		System.out.println("Grade F");
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
