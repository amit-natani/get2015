/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Mechanic extends PersonServiceStation {

	private String car;
	private int charge;
	
	/**
	 * @param name
	 */
	public Mechanic(String name, String car, int charge) {
		super(name);
		this.car = car;
		this.charge = charge;
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return super.toString()+", "+car+", "+charge;
	}

}
