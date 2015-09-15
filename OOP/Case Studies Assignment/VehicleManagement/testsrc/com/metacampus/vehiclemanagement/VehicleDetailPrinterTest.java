package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehicleDetailPrinter;

public class VehicleDetailPrinterTest {

	@Test
	public void testToStringCar() {
		Car car = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 2, 5);
		String s = "Make: Hyundai,Model: Verna,Engine CC: 1200 CC,Fuel Capacity: 60 Liters,Mileage: 21 km/pl,Number of Airbags: 2,Number of Seats: 5";
		assertEquals(s , VehicleDetailPrinter.printVehicleSpecification(car));
	}
	
	@Test
	public void testToStringCarNullTest() {
		Car car = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 2, 5);
		assertNotNull(car);
	}
	
	@Test
	public void testToStringBike() {
		Bike bike = VehicleHelper.create("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 5, "Stepped");
		String s = "Make: TVS,Model: Apache,Engine CC: 180 CC,Fuel Capacity: 14 Liters,Mileage: 40 km/pl,Number of Gears: 5,Type of Seat: Stepped";
		assertEquals(s , VehicleDetailPrinter.printVehicleSpecification(bike));
	}
	
	@Test
	public void testToStringBikeNullTest() {
		Bike bike = VehicleHelper.create("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 5, "Stepped");
		assertNotNull(bike);
	}
}

