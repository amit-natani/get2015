/**
 * 
 */

/**
 * @author Amit
 *
 */
public class MainShape {

	public static void main(String[] args) {
		try
		{
			Circle circle1 = new Circle(7);
			System.out.println(circle1.getArea());
			Square square1 = new Square(6);
			System.out.println(square1.getArea());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
