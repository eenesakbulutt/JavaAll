package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// TASK2

		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (Use 2 different loops)
		 * 
		 * 
		 */

		String[] countries = { "Afghanistan", "Tajikistan", "USA", "Japan" };

		String capital = "";

		for (String country : countries) {

			if (country.equals("Afghansitan")) {
				capital= "Kabul";

			} else if (country.equals("Tajiskistan")) {
				capital= "Dushanbe";

			} else if (country.equals("USA")) {
				capital = "Washington DC";

			} else if (country.equals("Japan")) {
				capital = "Tokyo";
			}
			
			
		System.out.println("The country of "+ country + "is "+ capital);
		}
		}

		

}
