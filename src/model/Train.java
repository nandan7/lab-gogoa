package model;

import java.time.LocalDate;

public class Train{

   private int noOfPersons;
   private int rates;
   private String berth;
   private LocalDate date;
public int getNoOfPersons() {
	return noOfPersons;
}
public void setNoOfPersons(int noOfPersons) {
	this.noOfPersons = noOfPersons;
}
public int getRates() {
	return rates;
}
public void setRates(int rates) {
	this.rates = rates;
}
public String getBerth() {
	return berth;
}
public void setBerth(String berth) {
	this.berth = berth;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public Train(int noOfPersons, int rates, String berth, LocalDate date) {
	super();
	this.noOfPersons = noOfPersons;
	this.rates = rates;
	this.berth = berth;
	this.date = date;
}
   

}