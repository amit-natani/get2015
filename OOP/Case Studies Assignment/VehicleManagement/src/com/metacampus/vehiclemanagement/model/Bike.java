package com.metacampus.vehiclemanagement.model;

public class Bike extends Vehicle {
	
	private int numberOfGears;
	private String typeOfSeat;
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int noOfGears) {
		this.numberOfGears = noOfGears;
	}
	public String getTypeOfSeat() {
		return typeOfSeat;
	}
	public void setTypeOfSeat(String typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}
	public String toString() {
		
		return super.toString()+",Number of Gears: "+
		getNumberOfGears()+",Type of Seat: "+getTypeOfSeat();
		
	}

}
