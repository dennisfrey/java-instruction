package ui;

import java.time.LocalDate;
import java.time.LocalTime;


import util.Console;

public class ArrivalTimeApp {

	public static void main(String[] args) {
		System.out.println("Arrival Time Estimator");
		
		String choice = "y";
		int miles = 0;
		int mph = 0;
		LocalDate depatureDate = LocalDate.now();
		LocalTime depatureTime = LocalTime.now();

		
		while(choice.equalsIgnoreCase("y")) {
			
			String input = "";
			input = Console.getString("Depature date (YYYY-MM-DD): ");
			depatureDate = LocalDate.parse(input);
			input = Console.getString("Depature time (HH:MM): ");
			depatureTime = LocalTime.parse(input);
			miles = Console.getInt("Number of miles: ", 0, 1000000);
			mph = Console.getInt("Miles per hour: ", 0, 300);
			
			System.out.println("\n Estimated travel time");
			System.out.println("Hours: ");
			System.out.println("Minutes: ");
			System.out.println("Number of miles: ");
			System.out.println("Miles per hour: ");
			
			choice = Console.getString("\nContinue? (y/n): ", "y","n");
			
		}
		
		System.out.println("\nBye!");
	}

	public static LocalDate setDate(String input) {
		LocalDate dt = LocalDate.new();
		
		
		
		
	}
}
