package com.metacampus.vehiclemanagement.helper;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;

public class VehicleHelper {
	
	public static Vehicle create(String make, String model, String engineCC, String fuelCapacity, String mileage)
	{
		Vehicle vehicle = new Vehicle();
		update(make, model, engineCC, fuelCapacity, mileage, vehicle);
		return vehicle;
	}
	
	private static void update(String make, String model,
			String engineCC,String fuelCapacity, 
			String mileage, Vehicle vehicle) {
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setEngineCC(engineCC);
		vehicle.setFuelCapacity(fuelCapacity);
		vehicle.setMileage(mileage);
	}
	
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
