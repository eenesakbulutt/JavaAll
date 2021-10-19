package com.syntax.class14;

public class StringMethodDemo3 {

	public static void main(String[] args) {
		
		
	String longStr="This class is easy";
	
	
	System.out.println(longStr.endsWith("y"));
		
	System.out.println(longStr.endsWith("easy"));	
		
	System.out.println(longStr.endsWith("This class is easy"));	
		
		
	//
	
	System.out.println(longStr.contains("class"));
	
	System.out.println(longStr.contains("i"));
	
	
	longStr="blabla";
	
	System.out.println(longStr.equals("Blabla"));
	System.out.println(longStr.equalsIgnoreCase("Blabla"));
	
		
	System.out.println(longStr.charAt(0));
	System.out.println(longStr.charAt(1));
	System.out.println(longStr.charAt(2));
	
	
	System.out.println("------------------------");
	
	
	System.out.println(longStr.indexOf("b"));
	System.out.println(longStr.indexOf("1"));
	System.out.println(longStr.indexOf("z"));
	System.out.println(longStr.indexOf("b",longStr.indexOf("b")+1));
	
	

	
	System.out.println(longStr.substring(2)); 
	// onceki karakterleri ignore ediyo gerisini yazdiriyo
	
	System.out.println(longStr.substring(2,4));
	
	//2. karakterden 4. karaktere kadar yazdiriyo. 2 dahil 4 degil ama
	
	
	
	}

}
