package com.syntax.class06;

import java.util.Scanner;

public class HW0106 {

	public static void main(String[] args) {

		String country, language;

		Scanner input = new Scanner(System.in);

		System.out.println("Where are you from?");
		country = input.nextLine();

		switch (country) {

		case "USA":
			language = "English";
			break;

		case "Turkey":
			language = "Turkish";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "France":
			language="French";
			break;
		case "Russia" :
			language="Russian";
		break;
		
		case "Ukraine":
			language="Ukranian";
			break;
			default:
				language="unknown";
				

		}

		System.out.println("Your language is "+ language);
		
		
	}

}
