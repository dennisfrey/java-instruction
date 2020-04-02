package ui;
import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Account application\n");
		String choice = "y";
		double checkingBalance = 1000.00;
		double savingsBalance = 1000.00;
		double fee = 1.00;
		double monthlyIntRate = .01; // 1% per month
		NumberFormat cf = NumberFormat.getCurrencyInstance();

		CheckingAccount c = new CheckingAccount(checkingBalance, fee);
		SavingsAccount s = new SavingsAccount(savingsBalance, monthlyIntRate);

		System.out.println("Starting Balances");
		System.out.println("Checking: " + cf.format(c.getBalance()));
		System.out.println("Savings: " + cf.format(s.getBalance()));

		System.out.println("\nEnter the transactions for the month");

		while (choice.equalsIgnoreCase("y")) {

			String action = Console.getString("\nWithdrawal or deposit? (w/d): ", "w", "d");
			String accountType = Console.getString("Checking or savings? (c/s): ", "c", "s");
			double amount;

			if (accountType.equalsIgnoreCase("c")) {
				
				if (action.equalsIgnoreCase("w")) {
					amount = Console.getDouble("Amount?: ", 0, c.getBalance() + .01);
					c.withdraw(amount);
				} else {
					amount = Console.getDouble("Amount?: ");
					c.deposit(amount);
				}
			} else {
				
				if (action.equalsIgnoreCase("w")) {
					amount = Console.getDouble("Amount?: ", 0, s.getBalance() + .01);
					s.withdraw(amount);
				} else {
					amount = Console.getDouble("Amount?: ");
					s.deposit(amount);
				}
			}

//			//Sean's approach
//			Account a;
//			
//			if (accountType.equalsIgnoreCase("c")) {
//
//				a = c;
//			} else {
//				
//				a = s;
//			}	
//
//			if (action.equalsIgnoreCase("w")) {
//				amount = Console.getDouble("Amount?: ", 0, a.getBalance() + .01);
//				a.withdraw(amount);
//				
//
//			} else {
//				amount = Console.getDouble("Amount?: ", 0, Double.POSITIVE_INFINITY);
//				a.deposit(amount);
//			}

			choice = Console.getString("\nContinue? (y/n): ", "y", "n");

		}

		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee: " + cf.format(fee));
		System.out.println("Savings interest payment: " + cf.format(s.getInterestPayment()));

		c.subtractFee();
		s.applyPayment();
		System.out.println("\nFinal Balances");
		System.out.println("Checking: " + cf.format(c.getBalance()));
		System.out.println("Savings: " + cf.format(s.getBalance()));

		System.out.println("\nGoodbye");

	}

}
