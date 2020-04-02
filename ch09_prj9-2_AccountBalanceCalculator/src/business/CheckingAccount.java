package business;

public class CheckingAccount extends Account {

	private double fee;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance, double fee) {
		super(balance);
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public void subtractFee() {
		balance -= fee;
	}

	@Override
	public String toString() {
		return "CheckingAccount [fee=" + fee + "]";
	}
	
	
	
}
