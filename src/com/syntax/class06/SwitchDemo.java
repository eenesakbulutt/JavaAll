package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
	int day=4;
	if(day==1) {
		System.out.println("Today is Monday");
	}else if(day==2) {
		System.out.println("Today is Tuesday");
	}else if(day==3) {
		System.out.println("Today is Wednesday");
	}else if(day==4) {
		System.out.println("Today is Thursday");
	}else if(day==5) {
		System.out.println("Today is Friday");
	}else if(day==6) {
		System.out.println("Today is Saturday");
	}else if(day==7) {
		System.out.println("Today is Sunday");
	}else {
		System.out.println(day+" is invalid numnber.Plese use day from 1-7");
	}
		
		System.out.println("------------------USING SWITCH STATEMENT----------------");
		
		String dayName;
		
		switch(day) {
		
		case 1:
		     dayName="Monday";
		     break;
		     
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
		    dayName="Thursday";
		    break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		     
		 default:
			 dayName="Invalid";
			 break;
		     		     
		     		     		     		    	   		     				     
		}
		
		
		
	System.out.println("Today is "+ dayName);	
	
	
	
	
	
	
	}

}
