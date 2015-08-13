/**
 @Program: To Compute GCD of two positive numbers
 @Date: 10/08/2015
 */

/**
 * @author Amit
 *
 */
import java.util.*;							// Package imported to use Scanner Class

public class GCDRecursion 
{

	public static void main(String[] args) 
	{
		/* Initialization */
		Scanner sc = new Scanner(System.in);	
		int firstNumber, secondNumber, gcd;				
		System.out.println("Enter Two Numbers: ");		
		
		/* Exception handling */
		try
		{
			firstNumber = sc.nextInt();					
			secondNumber = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("input number only");
			sc.close();
			return;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
		GCDRecursion GCDObj = new GCDRecursion();	
		gcd = GCDObj.gcd(firstNumber , secondNumber);				// Method Invocation to compute GCD
		
		if(gcd == -1)			//This part will be executed if value of either firstNumebr or SecondNumber or both are negative.
		{
			System.out.println("Please insert valid Numbers");
		}
		
		else				// This part will be executed if value of gcd returned by method gcd is >=0
		{
			System.out.println("GCD of "+firstNumber+" and "+secondNumber+" is: "+gcd);
		}
		sc.close();								
	}
	
	/* this method takes two numbers as arguments and returns GCD of the numbers */
	public int gcd(int num1, int num2)			
	{
		if(num1 < 0 || num2 < 0)	// this part will be executed if any or both of the numbers is negative
		{
			return -1;
		}
		
		if(num1 == 0)
		{
			return num2;
		}
		else if(num2 == 0)
		{
			return num1;
		}
		
		if(num1 < num2)			// this part will be executed if value of first number is less than value of second number passed in the method
		{
		
				return gcd(num2 % num1 , num1);		// recursive calling of method
			
		}
		
		else if(num1 > num2)	// this part will be executed if value of first number is greater than value of second number passed in the method
		{
			
				return gcd(num2 % num1 , num1); 	// recursive calling of method
		}
		
		else				// this is default case
		{
			return num1;
		}
		
	}

}
