/**
 @Program: To find largest digit in a given number
 @Date: 10/08/2015
 */

/**
 * @author Amit
 *
 */
import java.util.*;
public class LargestDigit {
	
	int max=0;									
	public static void main(String[] args) {
		/* Initialization */
		LargestDigit largestDigitObject = new LargestDigit();				
		Scanner sc = new Scanner(System.in);					
		long number, largestDigit;								
		System.out.println("Enter Number: ");					
		try
		{	
			number = sc.nextLong();
		}
		catch(Exception e)
		{
			System.out.println("Enter valid numebr");
			sc.close();
			return;
		}
		largestDigit=largestDigitObject.largestdigit(number);				// method invocation and result will be received in variable largestDigit
		System.out.println("Largest Digit is: "+largestDigit);	
		sc.close();
	}
	
	/* this recursive method takes a number as argument and return the largest digit from that number*/
	public long largestdigit(long number)		
	{
		if(number<0)
		{
			number=number*(-1);
		}
		if(number==0)								
		{
			return max;						// returning the max digit from the method
		}
		else
		{
			int digit=(int)number%10;		// calculates the least significant digit of the number and assign it in variable digit
			if(digit>max)				// condition to compare variable digit with previous maximum digit
			{
				max=digit;				// assign value of digit in variable max if value of digit is greater than value of max
			}
			
			try
			{
				number=number/10;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			return largestdigit(number);	// recursive calling of method largestdigit
		}	
	}

}
