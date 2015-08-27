import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		
		/*Initialization*/ 
		Scanner scan = null;
		BufferedReader bufferedReaderObj = null;
		int choice = 0, repeatChoice = 0, numberOfStudents;
		boolean result;
		String tempName;
		Queue queueObj = new Queue();
		try
		{
			scan = new Scanner(System.in);
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			do
			{
				/* Printing Menu */
				System.out.println("Menu: ");
				System.out.println("Press 1 to Insert a name in queue");
				System.out.println("Press 2 to remove front element from the queue");
				System.out.println("Press 3 make the queue empty");
				System.out.println("Press 4 to get front Element of queue");
				System.out.println("Press 5 to display queue");
				System.out.println("Press 6 for Student Councelling");
				System.out.println("Press 7 to exit");
				
				do {// Validation
					System.out.println("(Enter Positive Number)");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); // this is important!
					}
					choice = scan.nextInt();
					} while (choice <= 0);
				switch(choice)
				{
					/* Case for adding an element to the list */
					case 1:
						System.out.println("Enter Name to insert in the queue: ");
						while(true) {
							System.out.println("name : ");
							tempName = bufferedReaderObj.readLine();
							if(Validation.isName(tempName))
								break;
							else
								System.out.println("Please Enter a valid Name");
						}
						result = queueObj.enqueue(tempName);
						if(result)
							System.out.println("Name added Successfully");
						else
							System.out.println("Name is not added Successsfully");
						break;
						
						/* Case for adding an element to the list at specified index */
					case 2:
						Object removedItem;
						removedItem = queueObj.dequeue();
						System.out.println("Removed Item is: "+removedItem);
						break;
						
						/* case for find first occurrence of an element after specified index */
					case 3:
						queueObj.makeEmpty();
						break;
						
						/* case to find front element of the queue */
					case 4:
						Object frontItem;
						frontItem =	queueObj.getFront();
						System.out.println("Front of Queue is: "+frontItem);
						break;
						
						/* case to display the queue */
					case 5:
						queueObj.show();
						System.out.println();
						break;
					
					case 6:
						System.out.print("\n Enter number of students eligible for counseling : ");
						
						/* Inputting number of students from user */
						do {// Validation
							System.out.println("(Enter Positive Number(Greater than zero)");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							numberOfStudents = scan.nextInt();
							} while (numberOfStudents <= 0);	
						CollegeCounselling counseling = new CollegeCounselling();
						counseling.counselling(numberOfStudents);
						break;
						/* Exit Case */
					case 7:
						System.out.println("System Exits");
						System.exit(0);
						
						/*default case */
					default:
						System.out.println("Enter correct Choice");

				} 
				System.out.println("Do you want to continue press 1 for YES and any other number for NO");
	
					System.out.println("Enter Positive Number");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); // this is important!
					}
					repeatChoice = scan.nextInt();
					
			} while(repeatChoice == 1);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(repeatChoice != 1)
		{
			System.out.println("System Exited");
			System.exit(0);
		}
		scan.close();
	}

}

