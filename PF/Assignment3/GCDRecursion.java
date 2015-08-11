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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	// reference variable sc will hold Scanner object
		int firstNumber, secondNumber, gcd;					// variable declaration for tow numbers and their GCD
		System.out.println("Enter Two Numbers: ");		// Message for user to input the numbers
		firstNumber = sc.nextInt();					// inputting first number
		secondNumber = sc.nextInt();					// inputting second number
		GCDRecursion objOne = new GCDRecursion();	// objOne will hold an object of class GCDRecursion
		gcd = objOne.gcd(firstNumber , secondNumber);				// Method Invocation to compute GCD
		
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
	public int gcd(int num1,int num2)			
	{
		if(num1 < 0 || num2 < 0)	// this part will be executed if any or both of the numbers is negative
		{
			return -1;
		}
		
		if(num1 < num2)			// this part will be executed if value of first number is less than value of second number passed in the method
		{
			try
			{
				return gcd(num2 % num1 , num1);		// recursive calling of method
			}
			catch(Exception e)
			{
				if(num1 == 0)
				{
					return num2;
				}
				else
				{
					return num1;
				}
			}
		}
		
		else if(num1 > num2)	// this part will be executed if value of first number is greater than value of second number passed in the method
		{
			try
			{
				return gcd(num2 % num1 , num1); 	// recursive calling of method
			}
			catch(Exception e)
			{
				if(num1 == 0)
				{
					return num2;
				}
				else
				{
					return num1;
				}
			}		// recursive calling of method
		}
		
		else				// this is default case
		{
			return num1;
		}
		
	}

}
