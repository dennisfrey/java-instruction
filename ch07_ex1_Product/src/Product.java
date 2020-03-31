import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public void setAll(String code, String description, double price) {
    	this.code = code;
    	this.description = description;
    	this.price = price;
    }
    
    public String getPriceNumberFormat() {
    	NumberFormat formattedNumber = NumberFormat.getInstance();
    	formattedNumber.setMaximumFractionDigits(2);
    	formattedNumber.setMinimumFractionDigits(2);
    	return formattedNumber.format(price);
    }
}