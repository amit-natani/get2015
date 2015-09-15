package com.metacampus.vehiclemanagement.model;

public class Bike extends Vehicle {
	
	/* Data Members */
	private int numberOfGears;
	private String typeOfSeat;
	
	/** Method to get Number of gears of a bike 
	 * 
	 * @return numberofGears : number of gears in bike
	 */
	public int getNumberOfGears() {
		return numberOfGears;
	}
	
	/** Method to set number of gears of a bike
	 * 
	 * @param numberOfGears
	 */
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
	/** Method to get Type of seat of a bike 
	 * 
	 * @return typeOfSeat : type of seat of a bike
	 */
	public String getTypeOfSeat() {
		return typeOfSeat;
	}
	
	/** Method to set Type of seat of a bike
	 * 
	 * @param typeOfSeat
	 */
	public void setTypeOfSeat(String typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}
	
	/** Method to get string representation of details of a bike 
	 * Internally this method calls toString() of Vehicle class to print basic details 
	 * related to vehicle
	 */
	public String toString() {
		
		return super.toString()+",Number of Gears: "+
		getNumberOfGears()+",Type of Seat: "+getTypeOfSeat();
		
	}

}
