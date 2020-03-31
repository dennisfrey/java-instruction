//v4.6 -- changed closing message
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class BarAgeCheckerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		double tipAmountInt;
		double tipAmountDec;
		double totalAmount;
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to Java Happy Hour\n");

// Beginning of drink logic 

			System.out.println("Can I see your ID\n");
			System.out.print("Enter your Age: ");
			int age = sc.nextInt();
			System.out.println();
			Double Total = 0.0;



			if (age < 21) {
				System.out.print("You can order from this Menu\n");

				String menuChoice = " ";
				//Beginning of drink variables 
				
				
				while (!menuChoice.equalsIgnoreCase("X")) {

					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water Price| $0.00\n" +
							  "R - Root Beer Price| $1.50\n" +
							  "G - Ginger Ale Price| $1.50\n" + 
							  "J - Juice Price| $2.00\n"+
							  "RB - Redbull Price| $3.00\n"+
							  "MM - Mango Mule Mocktail Price| $7.15\n"+
							  "CF - Citrus Fizz Mocktail Price| $6.30\n"+
							  "VC - Virgin Cucumber Gimlet Mocktail Price $8.35\n"+
							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					
					

					case "W":
						System.out.println("Water Please\n");
						Double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Pleae\n");
						Double menuR  = 1.50;
						Total = Total + menuR;

						break;
					case "G":
						System.out.println("Ginger ale Please\n");
						Double menuG  = 1.50;
						Total = Total + menuG;

						break;
					case "J":
						System.out.println("Juice Please\n");
						Double menuJ  = 2.00;
						Total = Total + menuJ;
						break;
					case "RB":
						System.out.println("Redbull Please\n");
						Double menuRB  = 3.00;
						Total = Total + menuRB;
						break;

					case "MM":
						System.out.println("Mango Mule Mocktail Please\n");
						Double menuMM  = 7.15;
						Total = Total + menuMM;
						break;
					case "CF":
						System.out.println("Citrus Fizz Mocktail Please\n");
						Double menuCF  = 6.30;
						Total = Total + menuCF;
						break;
					case "VC":
						System.out.println("Virgin Cucumber Gimlet Mocktail Please\n");
						Double menuVC  = 8.35;
						Total = Total + menuVC;
						break;
					default:
						System.out.println("Invalid Choice, try again.\n");
						break;
					case "X":
						System.out.println("Thank you, come again\n");
						break;
						
					// end switch menu
					}
					Total = new BigDecimal(Total).setScale(2, RoundingMode.HALF_UP).doubleValue();
					new BigDecimal(Total).setScale(2, RoundingMode.HALF_UP).doubleValue();
					NumberFormat currency = NumberFormat.getCurrencyInstance();

					String TotalString = currency.format(Total);
					System.out.println("Total Bill: " + TotalString);
				}	// end while

				}
				else if (age >= 21) {
				System.out.println("You can order from this Menu");
				System.out.println();

				String menuChoice = " ";
				while (!menuChoice.equalsIgnoreCase("x")) {
					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water Price| $0.00\n" +
							  "R - Root Beer Price| $1.50\n" +
							  "G - Ginger Ale Price| $1.50\n" + 
							  "J - Juice Price| $2.00\n"+
							  "RB - Redbull Price| $3.00\n"+
							  "MM - Mango Mule Mocktail Price| $7.15\n"+
							  "CF - Citrus Fizz Mocktail Price| $6.30\n"+
							  "VC - Virgin Cucumber Gimlet Mocktail Price $8.35\n"+
							  "B - Beer Price| $6.00\n"+
							  "M - Martini Price| $7.50\n" +
							  "T - Gin & Tonic Price| $8.00\n" +
							  "O - Old Fashioned Price| $6.50\n"+
							  "JJ - Java Juice Price| $31.62\n"+

							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					case "W":
						System.out.println("Water Please\n");
						Double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Pleae\n");
						Double menuR  = 1.50;
						Total = Total + menuR;

						break;
					case "G":
						System.out.println("Ginger ale Please\n");
						Double menuG  = 1.50;
						Total = Total + menuG;

						break;
					case "J":
						System.out.println("Juice Please\n");
						Double menuJ  = 2.00;
						Total = Total + menuJ;
						break;
					case "RB":
						System.out.println("Redbull Please\n");
						Double menuRB  = 3.00;
						Total = Total + menuRB;
						break;
					case "MM":
						System.out.println("Mango Mule Mocktail Please\n");
						Double menuMM  = 7.15;
						Total = Total + menuMM;
						break;
					case "CF":
						System.out.println("Citrus Fizz Mocktail Please\n");
						Double menuCF  = 6.30;
						Total = Total + menuCF;
						break;
					case "VC":
						System.out.println("Virgin Cucumber Gimlet Mocktail Please\n");
						Double menuVC  = 8.35;
						Total = Total + menuVC;
						break;

					case "B":
						System.out.println("Beer Please\n");
						Double menuB  = 6.00;
						Total = Total + menuB;
						break;

					case "M":
						System.out.println("Martini Please\n");
						Double menuM  = 7.50;
						Total = Total + menuM;

						break;

					case "T":
						System.out.println("Gin & Tonic Please\n");
						Double menuT  = 8.00;
						Total = Total + menuT;
						break;
					case "O":
						System.out.println("Old Fashioned Please\n");
						Double menuO  = 6.50;
						Total = Total + menuO;
						break;
					case "JJ":
						System.out.println("Java Juice Please\n");
						Double menuJJ  = 31.62;
						Total = Total + menuJJ;
						break;
					
					case "X":
						System.out.println("Thank you, come again\n");
						break;
					default:
						System.out.println("Invalid Choice, try again.\n");
						break;
					// end switch menu
					}
					Total = new BigDecimal(Total).setScale(2, RoundingMode.HALF_UP).doubleValue();
					new BigDecimal(Total).setScale(2, RoundingMode.HALF_UP).doubleValue();
					NumberFormat currency = NumberFormat.getCurrencyInstance();

					String TotalString = currency.format(Total);
					System.out.println("Total Bill: " + TotalString);

					// end while

				}

			} // Possible spot for additional logic to calculate drink tab 
		

			
			
			System.out.println();
			System.out.print("Enter tip % amount: ");
			tipAmountInt = sc.nextInt();
			tipAmountDec = (tipAmountInt / 100) * Total;
			// System.out.println(tipAmountDec); for debuging
			totalAmount = tipAmountDec + Total;

			tipAmountDec = new BigDecimal(tipAmountDec).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(tipAmountDec).setScale(2, RoundingMode.HALF_UP).doubleValue();

			totalAmount = new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String tipAmountString = currency.format(tipAmountDec);

			String totalAmountString = currency.format(totalAmount);
			
			System.out.println();
			System.out.println("Tip amount: " + tipAmountString);
			System.out.println();
			System.out.println("Total amount: " + totalAmountString);

	
			
			System.out.println();
			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
		}
		System.out.println("Thank You for coming to Java Happy Hour");
		sc.close();
	
	}	
	
}

