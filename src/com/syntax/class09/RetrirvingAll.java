package com.syntax.class09;

public class RetrirvingAll {

	public static void main(String[] args) {
		
		
		
	char[]grades= {'A','B','C','D','E','F','G'};
	
	int size=grades.length; //gives the size---> how many elements in that array. 
	
	System.out.println(size);
	
	System.out.println(grades[1]);
		
		
	//i yi declaration yapalim mesela.	
	
	int i=0;
	System.out.println(grades[i]);
		
		
	i++;
	System.out.println(grades[i]);
		
		System.out.println("-----RETRIEVING ALL VALUES USING FOR LOOP------");
		for(int j=0; j<grades.length;j++) {
			System.out.println(grades[j]);
		}
		
		
		
		
		String[] names= {"Jose", "Sule", "Blake", "Enes", "Ana"};
		
		for(int k=0; k<names.length;k++) {
			System.out.println(names[k]);
		}
		 
		
		
		
	}

}
