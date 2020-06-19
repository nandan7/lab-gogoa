package services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{
	

  public double book(Flight flight) {
	   
	  LocalDate from=flight.getFrom();
	  LocalDate to=flight.getTo();
	  String type=flight.getTriptype();
	  int rates=flight.getRates();
	  int noOfPersons=flight.getNoOfPersons();
	  
	  if(type=="round-trip" && to.isAfter(from)) {
		  double amount= booking(noOfPersons,rates);
		  return (amount*1.5);
	  }
	  else {
		  double amount= booking(noOfPersons,rates);
	      return amount;
	  }
  }
  public double book(Train train) {
	  int noOfPersons=train.getNoOfPersons();
	  int rates=train.getRates();
	
	 double amount=booking(noOfPersons, rates);
	  return amount;
  }
  public double book(Bus bus) {
	  int noOfPersons=bus.getNoOfPersons();
	  int rates=bus.getRates();

	  double amount=booking(noOfPersons, rates);
	  return amount;
  }
  public double book(Hotel hotel) {
	  
	  LocalDate from=hotel.getFromdate();
	  LocalDate to=hotel.getTodate();
	  int noOfPersons=hotel.getNoOfPersons();
	  
	  if(noOfPersons==3) {
		  hotel.setRoomType("double");
		  hotel.setRoomType("single");
	  }
	  else if(noOfPersons==2) {
		  hotel.setRoomType("double");
	  }
	  else {
		  hotel.setRoomType("single");
	  }
	  long days=ChronoUnit.DAYS.between(from,to);
	  double amount=booking(noOfPersons,hotel.getRates());
	  return amount*days;
  }
}