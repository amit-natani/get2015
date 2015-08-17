import java.util.*;
/**
 * 
 */

/**
 * @author Amit
 *
 */
public class ServiceStation {

	private List<String> mechanics;
	private List<String> cars;
	private static int noOfMechanics;
	private int noOfCars;
	
	public ServiceStation(String name,String car, int charge)
	{
		noOfMechanics++;
		mechanics = new ArrayList<String>();
		cars = new ArrayList<String>();
	}
}
