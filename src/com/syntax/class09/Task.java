package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		
//1		
	char [] array=new char[6];
	
	array[0]='A';
	array[1]='B';
	array[2]='C';
	array[3]='D';
	array[4]='E';
	array[5]='F';
	
	
	System.out.println("Grade"+ " "+array[1]);
		
	
	//kisa yol
	char[]arryc= {'A', 'B','C','D','E'};	
	
	System.out.println("Grade"+" "+ arryc[1]);
	
	
	
		
		
//2
	String[] arr=new String[5];
	
	arr[0]="Ali";
	arr[1]="Veli";
	arr[2]="Deli";
	arr[3]="Enes";
	arr[4]="Sel";
	
	System.out.println(arr[3]);
		
//delcaration and storing values must be completed right away.	
String[] names= {"Jose", "Sule", "Blake", "Enes", "Ana"};
System.out.println(names.length);



System.out.println(names[2]);
	
names[1]="Kamil";

System.out.println(names[1]);
	
	
	int []num;
	num=new int[2];
	num[0]=1;
	num[1]=10;
	
	
	
int[]n;

//n={10,20}; not possible to add values this way after declaration.
		
		
//3
     String[] arrayz= {"Java", "Saturday", "day", "coding", "is"};
	
	System.out.println(arrayz[1]+" "+arrayz[4]+" "+arrayz[0]+" "+arrayz[3]+" "+arrayz[2]);





		

	}

}
