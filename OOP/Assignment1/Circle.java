
/**
 * @author Amit
 *
 */
public class Circle implements Shape {

	
	private int radius;
	public Circle(int radius) {

		this.radius = radius;
	}

	@Override
	public void draw() {

		System.out.println("This will draw a circle");
	}


	@Override
	public double getArea() {

		return ((22/7.0)*radius*radius);
	}

}
