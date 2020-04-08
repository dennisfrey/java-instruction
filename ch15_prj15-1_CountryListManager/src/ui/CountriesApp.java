package ui;



import java.util.ArrayList;

import business.CountryIO;
import util.Console;

public class CountriesApp {

	public static void main(String[] args) {
		System.out.println("Country List Manager");
		System.out.println("\nCommand Menu\n"+
							"1 - List countries\n"+
							"2 - Add a country\n"+	
							"3 - Exit");
		
		int choice = 0;
		CountryIO cio = new CountryIO();
		ArrayList<String> countries = new ArrayList<>();
		
		while(choice!=3) {
			choice = Console.getInt("\nEnter menu number ", 0, 4);
			if (choice == 1) {
				countries = cio.getCountries();
				System.out.println();
				for(String country: countries) {
					System.out.println(country);
				}
				
						
			} else if (choice == 2) {
				String country = Console.getString("\nEnter country: ", true);
				countries.add(country);
				boolean result = cio.saveCountries(countries);
				if (result) {
					System.out.println("This country has been saved");
				} else {
					System.out.println("Failed - Unable to Save");
				}
					
			
			} 
		}
		
		System.out.println("\nGoodbye");

	}

}
