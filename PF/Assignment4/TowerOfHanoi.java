
/**
 *Program Title: Tower of Hanoi using Recursion
 *Date: 12 Aug 2015
 */
import java.util.*;			// package imported to use Scanenr class
/**
 * @author Amit
 *
 */
public class TowerOfHanoi 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub

		List<String> Result=new ArrayList<String>();		// List instantiation of String type that will hold the movements
		TowerOfHanoi towerHanoi=new TowerOfHanoi();			// class instantiation with object named towerHanoi
		Scanner sc=new Scanner(System.in);					// sc will hold Scanner Object
		System.out.println("Enter Number of Disk for Tower Of Hanoi");
		int numberOfDisk=sc.nextInt();						// inputting number of disks
		if(numberOfDisk>0)									// check if numebr of disk is >0 or not
		{
			/* this code will be executed if the no of disk is greater than zero */
			
			Result=towerHanoi.towerOfHanoi("A","B","C",numberOfDisk, Result);
			Iterator<String> itr=Result.iterator();//getting Iterator from arraylist to traverse elements  
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  // printing the String values from the list
			}
		}
		Result.removeAll(Result);		// removeAll method will clear the list
		sc.close();
	}
	
	
	/* Recursive method that takes source peg, destination peg, auxiliary peg, numOfDisks, and the Result List as arguments
	 * 
	 */
	List<String> towerOfHanoi(String source, String destination, String temp, int numOfDisk, List<String> Result)
	{
		
		if(numOfDisk==1)
		{
			Result.add("Move Disk   "+numOfDisk+"   "+source+"->"+destination);	// adding the movement of disk to list if last disk is left on source peg
		}
		else
		{
			towerOfHanoi(source,temp,destination,numOfDisk-1, Result); // recursive calling for moving n-1 disks from source to temp
			Result.add("Move Disk   "+numOfDisk+"   "+source+"->"+destination);

			towerOfHanoi(temp,destination,source,numOfDisk-1, Result);	// recursive calling for moving n-1 disks from temp to destination

		}
		return(Result);
	}

}
