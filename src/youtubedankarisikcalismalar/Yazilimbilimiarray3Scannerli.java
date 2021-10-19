package youtubedankarisikcalismalar;

import java.util.Scanner;

public class Yazilimbilimiarray3Scannerli {

	public static void main(String[] args) {
		
		
	Scanner data= new Scanner(System.in);
	
	
	
	int[]arr2=new int [5];
		
		
	System.out.println("Array 2 nin degerlerini girin....");	
		
	for(int i=0; i<arr2.length; i++) {
		
		arr2[i]=data.nextInt();
		
		
	}
	
	System.out.println("Array 2 nin degerleri yaziliyor  ");
	for(int i=0; i<arr2.length;i++) {
		
		
		System.out.println("Eleman:"+ arr2[i]);	
		
		
	}
		
		
		

	}

}
