package com.syntax.reviewclass6;

public class StringPart1 {

	public static void main(String[] args) {
		
	String str="Hello";
	
	String str2=new String("Hello");
		
	//to identify the length of the string
	
	System.out.println(str.length());
		
	System.out.println(str2.length());	
		
	//to convert the string into uppercase
	String name= "My name is aka naughty boy";
		
	System.out.println(name.toUpperCase());	
		
	//to convert the string int lowercase
	
	String name2="MY NAME IS BILAL";
		
	System.out.println(name.toLowerCase());
		
	//add two strings together
	
	
	String firstName="Michael";
	
	String lastName="Bilal";
	
	
	System.out.println(firstName.concat(" ").concat(lastName));
	
	System.out.println(firstName+" "+ lastName);
	
	
	//isEmpty
	
	String batch= "";
	
	boolean result=batch.isEmpty();
	
	System.out.println(result);
	
	
	
	//to remove the whitespaces from the string
	
	
	String newString="      Batch10     ";
	
	System.out.println(newString);
	System.out.println(newString.trim());
	
	
	// 
	String newS="Batch 10";
	System.out.println(newS.replace(" ", ""));
	
	
	
	
	//to check the starting point of string
	
	String longString="This is SDET batch";
	
	
	System.out.println(longString.startsWith("T"));
	System.out.println(longString.startsWith("s"));
	
	
	
	}

}
