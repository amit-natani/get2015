package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehicleDetailPrinter;

public class VehicleDetailPrinterTest {

	@Test
	public void testToString() {
		Car car = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 2, 5);
		String s = "Make: Hyundai,Model: Verna,Engine CC: 1200 CC,Fuel Capacity: 60 Liters,Mileage: 21 km/pl,Number of Airbags: 2,Number of Seats: 5";
		assertEquals(s , VehicleDetailPrinter.printVehicleSpecification(car));
	}

}
