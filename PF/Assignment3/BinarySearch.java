/**
 @Program: To search a number in an array using Binary Search
 @Date: 10/08/2015
 */

/**
 * @author Amit
 *
 */
import java.util.*;								// Package imported to use Scanner class
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto- generated method stub
		Scanner sc=new Scanner(System.in);				// reference variable sc holds Scanner object for input
		BinarySearch objOne=new BinarySearch();			// objOne contains object of class LinearSearch
		int noOfElements, result, searchNumber;			// noOfElements will hold size of array, searchNumber will hold the number to be searched
														// and result will hold the index at which the number is found in array
		System.out.println("Enter No of Elements: ");	// Message for user to input total no of elements
		noOfElements = sc.nextInt();					// In this line total no of elements are takes as input and assigned to variable noOfElements
		if(noOfElements<=0)
		{
			System.out.println("No of Elements should be Positive(>0)");	// This message will be printed if the no of elements is zero or negative
		}
		else
		{
			int[] itemArray = new int[noOfElements];			// Array creation with size = noOFElements
			System.out.println("Enter elements of Array: ");
			for(int i=0; i < noOfElements; i++)
			{
				itemArray[i] = sc.nextInt();					// input elements of array using Scanner class object sc
			}
			System.out.println("Enter number to be searched: ");
			searchNumber=sc.nextInt();							// input a number to be searched
			
			/*	method invocation with parameters itemArray, searchNumber, min index and max index */
			result = objOne.binarySearch(itemArray, searchNumber, 0, noOfElements-1);	
			if(result == -1)
			{
				System.out.println(searchNumber+" is not found in the list");	//Message to be printed if the no is not found in the list
			}
			else
			{
				System.out.println(searchNumber+" is found at "+result+" index");	// message shows the index on which the number is found
			}
		}
		sc.close();
	}
	
	/* this recursive method takes itemArray[], searchNumebr, min index and max index as input and returns the index at which the searchNumber
	 is found in the itemArray and returns -1 if the number is not found*/
	public int binarySearch(int[] itemArray, int searchNumber, int min, int max)
	{
		int length = itemArray.length;				//  variable length will contain the length of itemArray
		if(length==0)
		{
			return -2;								// return -2 if the itemArray is empty i.e. no items in the array
		}
		if(max<min)
		{
			return -1;		// return -1 if value of max is less than value of min
		}
		
		int mid = (max + min) / 2;			// calculate mid index value 

		if(searchNumber == itemArray[mid])		// compare searchNumber and the item at mid index of itemArray
		{
				return mid;		// return value of mid if searchNumber and the item at mid index of itemArray are equal
								// i.e. searchNumber is found at mid index
		}
		else if(searchNumber < itemArray[mid])							// this part will be executed
		{																// if searchNumber is greater than the item at mid index of itemArray 
			return binarySearch(itemArray, searchNumber, min, mid-1);	// recursive calling of method with parameters 
																		//including itemArray, searchNumber, min and (mid-1) as max
		}
		else															// this part will be executed				 if searchNumber is greater than the item at mid index of itemArray
		{																// if searchNumber is greater than the item at mid index of itemArray
			return binarySearch(itemArray, searchNumber, mid+1, max);	// recursive calling of method with parameters 
		}																//including itemArray, searchNumber, (mid+1) as min and max
	}
		
}
