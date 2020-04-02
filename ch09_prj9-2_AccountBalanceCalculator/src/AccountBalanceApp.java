import java.text.NumberFormat;

public class AccountBalanceApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Account application\n");
		String choice = "y";
		double checkingBalance = 1000.00;
		double savingsBalance = 1000.00;
		double fee = 1.00;
		double monthlyIntRate = .002; // 2.4% annual converted into monthly
		NumberFormat cf = NumberFormat.getCurrencyInstance();

		CheckingAccount c = new CheckingAccount(checkingBalance, fee);
		SavingsAccount s = new SavingsAccount(savingsBalance, monthlyIntRate);

		System.out.println("Enter the transactions for the month\n");

		while (choice.equalsIgnoreCase("y")) {

			String action = Console.getString("Withdrawal or deposit? (w/d): ", "w", "d");
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

			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
			
		}

		
				
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee: " + cf.format(fee));
		System.out.println("Savings interest payment: " + cf.format(s.getInterestPayment()));
		
		System.out.println("\nFinal Balances");
		System.out.println("Checking: " + cf.format(c.subtractFee()));
		System.out.println("Savings: " + cf.format(s.getBalance() + s.getInterestPayment()));
		
		System.out.println("\nGoodbye");

	}

}
