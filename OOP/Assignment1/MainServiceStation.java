
/**
 * @author Amit
 *
 */
public class MainServiceStation {

	public static void main(String[] args) {
		try
		{
			ServiceStation serviceStationObj = new ServiceStation();
			serviceStationObj.readMechanics();
			serviceStationObj.readCars();
			serviceStationObj.assignCars();
			System.out.println("the total income for the day is : " + serviceStationObj.getIncome() + "\n");
			System.out.println("the number of cars serviced today are : \n" + serviceStationObj.getCarsServiced());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}