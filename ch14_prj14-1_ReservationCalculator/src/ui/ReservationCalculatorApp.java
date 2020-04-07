package ui;

import java.time.LocalDate;

import util.Console;
import util.Reservation;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		
		LocalDate arrivalDate;
		LocalDate departureDate;
		String choice = "y";
		
		
		while(choice.equalsIgnoreCase("y")) {
			
			arrivalDate = getInput("arrival");
			departureDate = getInput("departure");
			Reservation r = new Reservation(arrivalDate, departureDate);
			
			System.out.println("\nArrival Date: " + r.getArrivalDateFormatted());
			System.out.println("Departure Date: " + r.getDepartureDateFormatted());
			System.out.println("Price: " + r.getPricePerNightFormatted() + " per night");
			System.out.println("Total price: "+ r.getTotalPriceFormatted() + " for " +  
								r.getNumberOfNights() + " nights");
			
			choice = Console.getString("\nContinue? (y/n): ", "y","n");
		}
		
		System.out.println("\nBye!");

	}

	private static LocalDate getInput(String type) {
		
		LocalDate dt = LocalDate.now();
		int input = 0;
		input = Console.getInt("\nEnter the " + type + " month (1-12): ", 0, 13);
		dt = dt.withMonth(input);
		input = Console.getInt("Enter the " + type + " day (1-31): ", 0, 32);
		dt = dt.withDayOfMonth(input);
		input = Console.getInt("Enter the " + type + " year: ", 2019, 2100);
		dt = dt.withYear(input);
		
		return dt;
	}
	
}
