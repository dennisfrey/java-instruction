
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
	
	public double subtractFee() {
		return getBalance() - fee;
	}

	@Override
	public String toString() {
		return "CheckingAccount [fee=" + fee + "]";
	}
	
	
	
}
