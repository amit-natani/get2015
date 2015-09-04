import java.util.Scanner;


public class MainSortingSystem {

	public static void main(String[] args) {
		
		/* Initialization */
		SortingSystem sortingSystemObj = null;
		Scanner scan = null;
		try
		{
			/* Instantiation */
			int numberOfElements, choice;
			sortingSystemObj = new SortingSystem();
			scan = new Scanner(System.in);
			do
			{
				System.out.println("Enter Number of Elements to be sorted");
				
				/* Inputting number of elements */
				do {
					System.out.println("Enter positive integer only");
					while(!scan.hasNextInt()) {
						System.out.println("Enter Numebr Only");
						scan.next();
					}
					numberOfElements = scan.nextInt();
				} while(numberOfElements <= 0);
				
				/* length of array itemArray will be equal to numberOfElements */
				int[] itemArray = new int[numberOfElements];
				
				/* Inputting Numbers for Sorting */
				for(int i = 0; i < numberOfElements; i++) {
					System.out.println("Enter Number "+(i+1));
					do {
						System.out.println("(Enter positive integer only)");
						while(!scan.hasNextInt()) {
							System.out.println("Enter Number Only");
							scan.next();
						}
						itemArray[i] = scan.nextInt();
					} while(itemArray[i] < 0);
				}
				
				/* Taking user's chocie whether he wants to sort using comparision sort
				 * or linear Sort
				 */
				System.out.println("Enter choice: ");
				System.out.println("1. Comparision Sorting");
				System.out.println("2. Linear Sorting");
				System.out.println("3. Exit");
				do {
					System.out.println("(Enter positive integer only)");
					while(!scan.hasNextInt()) {
						System.out.println("Enter Numebr Only");
						scan.next();
					}
					choice = scan.nextInt();
				} while(choice <= 0 || choice >= 4);
				
				/* Switch case based on user's choice */
				switch(choice) {
				 
					/* If choice is 1, then comparision sorting will be performed */
					case 1:
						itemArray = sortingSystemObj.comparisionSorting(itemArray);
						break;
						
					/* If choice is 2, then linear sorting will be performed */
					case 2:
						itemArray = sortingSystemObj.linearSorting(itemArray);
						break;
						
					/* If choice is 3, then system will be closed */
					case 3:
						System.out.println("System Closed");
						System.exit(0);
						break;
					
					/* default Case */
					default:
						System.out.println("Enter Correct Choice");
				}
				
				/* Printing Sorted array */
				System.out.println("Sorted array is: ");
				for(int a: itemArray)
					System.out.println(a);
			} while(true);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
