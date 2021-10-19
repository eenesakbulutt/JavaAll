package com.syntax.class09;

public class ClockExampleShorterWay {

	public static void main(String[] args) {
		
	String min="", hour="";
	
	
		
	for(int h=0; h<=23;h++) {	
		
	for(int m=0;m<=59;m++) {	
		
		
		if(h<10) {
			hour="0"+h;
		}else {
			hour=""+h;
		}
		
		
		if(m<10) {
			min="0"+m;
		}else {
			min=""+m;
		}
		
		
		System.out.println(hour+ ":" + min);
		
	}
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
	}

}
