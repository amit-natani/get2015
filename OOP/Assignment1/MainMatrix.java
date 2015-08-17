/**
 * 
 */
import java.util.*;
/**
 * @author Amit
 *
 */
public class MainMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			Matrix matrix1 = new Matrix(2,3);
			for(int i = 0; i < 2 ; i++)
			{
				for(int j = 0; j < 3 ; j++)
				{
					matrix1.addElements(i , j , sc.nextInt());
				}	
			}
			matrix1.show();
			Matrix matrix2 = matrix1.transpose();
			matrix2.show();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
	}

}
