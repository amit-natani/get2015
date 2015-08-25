package com.metacampus.vehiclemanagement.model;

public class Car extends Vehicle {

	/* Data Members */
	private int numberOfAirbags;
	private int numberOfSeats;
	
	/** This method returns number of airbags in a car
	 * 
	 * @return numberOfAirbags
	 */
	public int getNumberOfAirbags() {
		return numberOfAirbags;
	}
	
	/** this method set number of airbags in car
	 * 
	 * @param numberOfAirbags
	 */
	public void setNumberOfAirbags(int numberOfAirbags) {
		this.numberOfAirbags = numberOfAirbags;
	}
	
	/** This method returns number of seats in a car 
	 * 
	 * @return numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	/** This method set number of seats in a car
	 * 
	 * @param numberOfSeats
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	/** Method to get string representation of details of a car 
	 * Internally this method calls toString() of {@link Vehicle} to print basic details 
	 * related to vehicle
	 */
	public String toString() {
		
		return super.toString()+",Number of Airbags: "+
		getNumberOfAirbags()+",Number of Seats: "+getNumberOfSeats();
		
	}
}
