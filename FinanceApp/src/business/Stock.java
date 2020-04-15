package business;

public class Stock {

	private int id;
	private String symbol;
	private String companyName;
	private double price;
	
	public Stock(int id, String symbol, String companyName, double price) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.companyName = companyName;
		this.price = price;
	}

	public Stock() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "ID = " + id + ", Symbol = " + symbol + ", companyName = " + companyName + " price = " + price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
