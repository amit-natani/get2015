/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Square implements Shape {

	
	private int side;
	public Square(int side) {
		
		this.side = side;
	}

	@Override
	public void draw() {
	
		System.out.println("This will draw a Circle");
	}

	
	@Override
	public double getArea() {
		
		return (side*side);
	}

}
