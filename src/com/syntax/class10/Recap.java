package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		
		String []array=new String[3];
		
		array[0]="Hello";
		array[1]="Hi";
		
		// System.out.println(array[3]);---->ArrayIndexOutOfBoundsException
		
	System.out.println(array[2]); //null		
		
		
	int size= array.length;
	System.out.println(size);
	
	array[2]="How are you?";
	
	
	
	System.out.println(array[2]); //How are you ?
	
	for(int i=0;i<3;i++) {
		System.out.print(array[i]+"; ");
	}
	
	System.out.println("------------------------------");
	
	
	for(String arr:array) {
		System.out.println(arr+";");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
