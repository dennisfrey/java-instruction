import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		
		//Welcome Message
		System.out.println("Welcome to the Travel Time Calculator");
		
		//Initial Scanner
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			
			//User Inputs
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			
			
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();

			//Get hours
			//double dTime = miles/mph;
			
			//Cast to int to truncate - avoid rounding the hours
			//int hours = (int)dTime;
			
			//Calculating minutes using modulus %
			//double remainder = miles % mph;
			//int minutes = (int)((remainder/mph)*60);
			
			//modulus solution in 2 lines
			int hours = (int)(miles/mph);
			int minutes = (int)(((miles % mph)/mph)*60);
			
			
			//int minutes = (int)(((miles/mph)% 1)*60);
			//double test = (miles/mph) % 1; 
		    //	System.out.println(test);
			
			
			//In case I can't get modulus to work
			// truncating int to match project example 200/65 = 4 minutes
			// 200/65 = 3.07692  3 hours and for minutes .07692 * 60 = 4.61538
			//int minutes = (int)((dTime - hours) * 60);
			

			
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
			
		}
		
		sc.close();
		System.out.println("Goodbye!");
	}

}
