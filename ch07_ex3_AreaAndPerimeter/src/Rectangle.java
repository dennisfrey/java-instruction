import java.text.NumberFormat;

public class Rectangle {
	
	double length;
	double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void initialize() {
		this.length = 0;
		this.width = 0;
	}
	
	public void initialize(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		double d = 0.0;
		d = this.length * this.width;
		return d;
	}

	public String getFormattedArea() {
		NumberFormat nf = NumberFormat.getInstance();
    	nf.setMinimumFractionDigits(3);
    	return nf.format(this.length * this.width);	
	}
	
	public double getPerimeter() {
		double d = 0.0;
		d = 2 * this.length + 2 * this.width;
		return d;
	}

	public String getFormattedPerimeter() {
		NumberFormat nf = NumberFormat.getInstance();
    	nf.setMinimumFractionDigits(3);
    	return nf.format(2 * this.length + 2 * this.width);
		
	}
	
}
