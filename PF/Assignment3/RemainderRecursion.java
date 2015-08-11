
/**
 @Program: To compute remainder of two numbers.
 @Date: 10th Aug 2015
		
 */

/**
 * @author Amit
 *
 */
import java.util.*;					// package imported to use Scanner Class
public class RemainderRecursion {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);					// reference variable sc contains Scanenr object
		RemainderRecursion obj = new RemainderRecursion();		// Class instantiation with object named obj
		int dividend , divisor , remainder;						// Variable Declaration
		System.out.println("Enter the dividend: ");				// Message for user to input value of dividend
		dividend = sc.nextInt();								// input in dividend
		System.out.println("Enter the divisor: ");				// Message for user to input value of divisor
		divisor = sc.nextInt();									// input in divisor
		remainder = obj.rem(dividend , divisor);				// Method invocation and returning result to remainder variable
		if(remainder == -1)					// check whether remainder is -1				
		{
			System.out.println("Divisor Can't be Zero");  
		}
		else			// this part will be executed if remainder is >=0
		{
			System.out.println("Remainder is: "+remainder);		// Printing the remainder generated by rem method
		}	
		sc.close();
	}
	
	/*This method takes two inputs dividend and divisor and returns remainder of the two.*/
	public int rem(int dividend, int divisor)			
	{
		if(divisor == 0)						// Condition for checking whether divisor is zero or not
		{
			return -1;				//return -1 in case if divisor is zero							
		}
		else if(dividend < divisor)						
		{
			return dividend;		// return dividend if dividend is less than divisor
		}	
		else
		{
			return rem(dividend - divisor, divisor);			// recursive calling of method with operands (dividend - divisor) and divisor
		}
	}
}
