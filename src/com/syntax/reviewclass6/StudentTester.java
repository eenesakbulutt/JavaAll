package com.syntax.reviewclass6;

public class StudentTester {

	public static void main(String[] args) {
	
		
	Student bilal=new Student();
	
	bilal.name="Ahmad";
	bilal.id="99";
	bilal.gender='M';
	bilal.school="Syntax";
	bilal.tuition=15000;
	
	bilal.study();              //behaviour
	bilal.payTuition();          //behaviour
		
	
		
		
	Student serge=new Student();
	serge.name="Casian";
	serge.id="98";
	serge.gender='M';
	serge.school="Syntax";
	serge.tuition=10000;
	
	serge.study();
	serge.payTuition();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
