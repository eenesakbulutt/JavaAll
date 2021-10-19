package com.syntax.class12;

public class Dog {

	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	
	
	void bark() {      // behaviour=bark
		
		System.out.println("Dog can bark");
	}
	
	
	
	
	void sleep() {
		
	System.out.println("Dog can sleep");
			
	}
		
	
	
	public static void main(String[]args) {
		
	Dog dog1=new Dog();	
		
	
	
		
	dog1.name="Papa";
	dog1.age=23;
	dog1.color="yellow";
	dog1.height=45;
	dog1.gender='M';	
	dog1.breed="Bull dog";	
		
		
		
	dog1.bark();
	
	dog1.sleep();
	
	
	
	Dog dog2=new Dog();
	
	
    dog2.name="Roni";
    dog2.age=22;
    dog2.color="blue";
    dog2.gender='F';
    dog2.height=23;
	dog2.breed="shitzu";
	
	
	
	dog2.sleep();
	
	
	
	
	
	
	
	
	
	}

}
