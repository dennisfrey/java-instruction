import java.text.NumberFormat;

public class Product implements Printable, Cloneable {
	// 1) define some instance variables 
	// (encapsulating - private)
	private String code;
	private String description;
	private double price;
	private static int numberOfObjects; //this counter can be shared across all instances 
	
	// 2) define constructors
	// access modifiers always public
	// empty/default constructor - no parameters
	public Product() {
		// explicitly initialize variables
		code = "";
		description = "";
		price = 0;
		numberOfObjects++;
	}

	// fully loaded constructor (all variables)
	// Used auto generate constructor using eclipse
	// "this" keyword is referring to the instance variable and not the input parameter
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
		numberOfObjects++;
	}
	
	// 3) define getters/setters
	// getters and setters are public
	public String getCode() {
		return code;
	}
	
	public void setCode(String cd) {
		code = cd;
	}
	
	// auto generate

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(price);
	}

	//	4) (optional) toString()
	
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + getPriceFormatted() + 
				" # of objects = " +numberOfObjects + "]";
	}

	@Override
	public void print() {
		System.out.println(description + "|" + getPriceFormatted());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
