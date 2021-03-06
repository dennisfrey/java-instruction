package business;

public class SavingsAccount extends Account {

	private double interestRate;
	private double interestPayment;
	
	
	public SavingsAccount() {
		super();
	}


	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
		
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public double getInterestPayment() {
		interestPayment = balance * interestRate;
		return interestPayment;
	}


	public void setInterestPayment(double interestPayment) {
		this.interestPayment = interestPayment;
	}

	public void applyPayment() {
		balance += getInterestPayment();
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", interestPayment=" + interestPayment + "]";
	}
	
	
}
