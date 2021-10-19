package com.syntax.reviewclass6;



	



public class Dog {

	
	String name;
	String breed;
	String color;
	int age;
	char gender;
	double height;
	int weight;
	
	
	void bark()
	{	
		System.out.println("Dog can bark");
	}
	
	void sleep() {
		System.out.println("dog can sleep");
	}
	
	
public static void main (String[]args) {
	
	Dog dog1=new Dog();
	
	dog1.name="Jerry";
    dog1.color="brown";
    dog1.breed="Labra";
    dog1.age=21;
    dog1.gender='M';
    dog1.weight=43;
    
    dog1.bark();
    dog1.sleep();
    
    
    
    Dog dog2=new Dog();
    dog2.name="Tommy";
    dog2.color="black";
    dog2.breed="Labra";
    dog2.age=19;
    dog2.gender='M';
    dog2.height= 19;
    dog2.weight=34;
    		
    
	
	
	
	
	
		
		
		
		
	}
	
	
	
	
	
	
}
