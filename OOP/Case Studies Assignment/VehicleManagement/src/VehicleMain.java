import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehicleDetailPrinter;


public class VehicleMain {

	public static void main(String[] args) {
		
		/* Car object creation */
		Car carObj = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 2, 5);
		System.out.println( VehicleDetailPrinter.printVehicleSpecification(carObj));
		
		/* Bike object creation */
		Bike bikeObj = VehicleHelper.create("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 5, "Stepped");
		System.out.println( VehicleDetailPrinter.printVehicleSpecification(bikeObj));

	}

}
