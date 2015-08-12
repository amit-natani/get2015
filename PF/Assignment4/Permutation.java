/**
 *Program Title: to find permutations of a given string using Recursion
 *Date: 12 Aug 2015
 */
import java.util.*;	// package imported to use Scanner Class

/**
 * @author Amit
 *
 */
public class Permutation 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String inputString;			// inputString will store the input string
		Scanner sc = new Scanner(System.in);		// sc holds the Scanenr object
		System.out.println("Enter a String: ");
		inputString = sc.next();			// inputting a string from user
		Permutation permutationObject=new Permutation();		// class instantiation 
		permutationObject.permute(inputString);		// permute method invocation with parameter inputString
		sc.close();									// sc object closed
	}
	
	/* this method takes input string as argument and call other method named doPermute with parameters 
	 * char array inputArray.  List Object Result, boolean array characterUsed, length of input as inputLength
	 * level and outputString as StringBuilder 
	 */
	List<String> permute(String inputString)
	{
	  int inputLength = inputString.length();	// inputLnegth will contain length of input string
	  StringBuilder outputString = new StringBuilder();	
	  boolean[ ] characterUsed = new boolean[ inputLength ];	// boolean array with size equal to inputLength
	  List<String> Result = new ArrayList<String>();			// List type object Result is defined
	  char[ ] inputArray = inputString.toCharArray( );			// this will convert input string in character array
	  
	  
	  /* the result of doPermute will be stored in List named result */
	  Result = doPermute ( inputArray, Result, characterUsed, inputLength, 0, outputString);
	  
	  /* Printing all values stored in the List Result */
	  for(String s : Result)
	  {
		  System.out.println(s);
	  }
	  return Result;		// Returning the list Result 

	}
	
	/* recursive method with parameters 
	 * char array inputArray.  List Object Result, boolean array characterUsed, length of input as inputLength
	 * index and outputString as StringBuilder */
	List<String> doPermute ( char[] inputArray, List<String> Result, boolean[ ] characterUsed, int inputLength, int index, StringBuilder outputString)
	{
		boolean flag = false;
		
		/* checking for the duplicate strings */
		if( index == inputLength) 
		{
			for(String tempString : Result)
			{
				if(tempString.equals(new String(outputString)))
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
				/* this code will be executed if the permutation is not repeated */
				Result.add(outputString.toString());		// Add permutations to List Result
			return Result;			// returning the List Result
		}
		
		for( int i = 0; i < inputLength; ++i )
		{       
	
			if( characterUsed[i] ) 
				continue;		// continue if character is already traced
			
			outputString.append( inputArray[i] );      // append the next character to outputArray
			characterUsed[i] = true;       
			doPermute( inputArray,   Result, characterUsed, inputLength, index + 1, outputString); // recursive calling with increased index
			characterUsed[i] = false;       			
			outputString.setLength(outputString.length() - 1 );	// decrementing length of outputString by 1 for next different character
		}
		return Result;  // returning the List Result
	}
}




