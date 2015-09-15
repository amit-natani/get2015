package com.metacampus.vehiclemanagement.helper;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;

/** This class helps in creating objects of Car and Bike. In this class
 * We have overloaded method create() to create objects of Bike nad Car
 */
public class VehicleHelper {
	
	/** Method to create object of Vehicle
	 * 
	 * @param make : Company Name
	 * @param model : Model Name
	 * @param engineCC : Engine CC
	 * @param fuelCapacity : Fuel Capacity
	 * @param mileage : Mileage 
	 * @return Vehicle Object
	 */
	public static Vehicle create(String make, String model, String engineCC, String fuelCapacity, String mileage)
	{
		Vehicle vehicle = new Vehicle();
		update(make, model, engineCC, fuelCapacity, mileage, vehicle);
		return vehicle;
	}
	
	/** Private method to insert basic vehicle details
	 * 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param vehicle
	 */
	private static void update(String make, String model,
			String engineCC,String fuelCapacity, 
			String mileage, Vehicle vehicle) {
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setEngineCC(engineCC);
		vehicle.setFuelCapacity(fuelCapacity);
		vehicle.setMileage(mileage);
	}
	
	/** Method to create object of Bike
	 * 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param numberOfGears
	 * @param typeOfSeat
	 * @return Bike Object
	 */
	public static Bike create(
			String make, String model,
			String engineCC, String fuelCapacity,
			String mileage, int numberOfGears, String typeOfSeat) {
		Bike bike = new Bike();
		update(make, model, engineCC, fuelCapacity, mileage, bike);
		bike.setNumberOfGears(numberOfGears);
		bike.setTypeOfSeat(typeOfSeat);
		return bike;
	}
	
	/** Method to create object of Car
	 * 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param numberOfAirbags
	 * @param numberOfSeats
	 * @return Car Object
	 */
	public static Car create(
			String make, String model,
			String engineCC, String fuelCapacity,
			String mileage, int numberOfAirbags, int numberOfSeats) {
		Car car = new Car();
		update(make, model, engineCC, fuelCapacity, mileage, car);
		car.setNumberOfAirbags(numberOfAirbags);
		car.setNumberOfSeats(numberOfSeats);
		return car;
	}

}
