package com.syntax.class10;

public class Task2SwitchCaseWay {

	public static void main(String[] args) {

		String[] countries = { "Afghanistan", "Tajikistan", "USA", "Japan" };

		String capital = "";	
		
		for(int i=0;i<countries.length;i++) {
			
			
			
			
			switch(countries[i]) {
			case "Afghanistan":
				capital= "Kabul";
				break;
			case"Tajikistan":
				capital= "Dushanbe";
				break;
			case "USA":
				capital= "Washington DC";
				break;
			case "Japan":
				capital="Tokyo";
				break;
				
				
				
			}
			
			
			
			System.out.println("The country of "+ countries[i]+ " is "+ capital);
		}
		
		
		
		
		
	}

}
