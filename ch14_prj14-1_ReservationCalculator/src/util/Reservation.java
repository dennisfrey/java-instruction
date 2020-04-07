package util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import javax.swing.text.NumberFormatter;

public class Reservation {

	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private final double RATE = 145.00;
	
	public Reservation() {
		super();
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(arrivalDate);
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(departureDate);
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public double getRATE() {
		return RATE;
	}
	
	public String getPricePerNightFormatted() {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(RATE);
	}
	
	public int getNumberOfNights() {
		return (int)ChronoUnit.DAYS.between(arrivalDate, departureDate);
	}
	
	public double getTotalPrice() {
		return getNumberOfNights() * RATE;		
	}
	
	public String getTotalPriceFormatted() {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.format(getTotalPrice());
	}
	
}
