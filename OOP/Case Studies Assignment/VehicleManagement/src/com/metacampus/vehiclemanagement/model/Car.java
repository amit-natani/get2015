package com.metacampus.vehiclemanagement.model;

public class Car extends Vehicle {

	private int numberOfAirbags;
	private int numberOfSeats;
	public int getNumberOfAirbags() {
		return numberOfAirbags;
	}
	public void setNumberOfAirbags(int numberOfAirbags) {
		this.numberOfAirbags = numberOfAirbags;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String toString() {
		
		return super.toString()+",Number of Airbags: "+
		getNumberOfAirbags()+",Number of Seats: "+getNumberOfSeats();
		
	}
}
