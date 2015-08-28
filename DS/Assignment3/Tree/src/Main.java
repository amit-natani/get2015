import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		/* Initialization */
		BinaryTree binaryTreeObj1 = null;
		BinaryTree binaryTreeObj2 = null;
		Scanner scan = null;
		
		try
		{
			binaryTreeObj2 = new BinaryTree();
			binaryTreeObj1 = new BinaryTree();
			scan = new Scanner(System.in);
			int choice, number;
			int count = 0;
					
			while (true) {
				
				/* Menu shown to the user */
				System.out.println("Enter your choice\n");
				System.out.println("1. Insert Element into tree");
				System.out.println("2. Preorder Traversal");
				System.out.println("3. Postorder Traversal");
				System.out.println("4. Check for mirror image");
				System.out.println("5. Exit");
				
				/* Taking user's choice as input */
				do {// Validation
					System.out.println("Enter Positive Number");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); 
					}
					choice = scan.nextInt();
					} while (choice <= 0);
	
				switch (choice) {
			
					/* Case to insert elements into tree */
					case 1:
						System.out.println("Enter Number of elements to be inserted in the tree: ");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); 
							}
							count = scan.nextInt();		// taking input number of elements in count
							} while (count < 0);
						/* If count is zero then elements are not taken as input */
						if(count == 0)
							break;
						System.out.println("enter " + count + " numbers.");
						for (int i = 0; i < count; i++) {
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); 
							}
							number = scan.nextInt();	// taking elements as input
							binaryTreeObj1.insert(number);
						}
						break;
				
						/* Case for preorder traversal */
					case 2:
						
						/* Clearing preorderList */
						BinaryTree.preorderList.clear();
						
						/* Clearing postorderList */
						BinaryTree.postorderList.clear();
						binaryTreeObj1.preOrder(binaryTreeObj1.root);
						
						/* Showing preorder traversal stored in preorderList*/
						System.out.print("Preorder Traversal is : ");
						for (Integer i : BinaryTree.preorderList) {
							System.out.print(i + " ");
						}
						
						System.out.println();
						break;
			
						/* Case for postorder traversal */
					case 3:
						
						/* Clearing preorderList */
						BinaryTree.preorderList.clear();
						
						/* Clearing postorderList */
						BinaryTree.postorderList.clear();
						binaryTreeObj1.postOrder(binaryTreeObj1.root);
						
						/* Showing postorder traversal stored in postorderList*/
						System.out.print("Postorder traversal is : ");
						for (Integer i : BinaryTree.postorderList) {
							System.out.print(i + " ");
						}
						System.out.println();
						break;	
			
						/* Case to insert elements into mirror tree and check whether
						 * both the trees are mirror image or not */
					case 4:
						
						/* Clearing preorderList */
						BinaryTree.preorderList.clear();
						
						/* Clearing postorderList */
						BinaryTree.postorderList.clear();
						
						/* Inputting elements of second tree */
						System.out.println("Enter "+count+" numbers for Second Tree.");
						for (int i = 0; i < count; i++) {
							while (!scan.hasNextInt()) {
								System.out.println("That's not a number!Please enter again");
								scan.next(); 
								}
							number = scan.nextInt();
							binaryTreeObj2.insertInMirrorTree(number);
						}
						
						/* Checking for mirror iamge */
						BinaryTree.checkMirrorImage(binaryTreeObj1, binaryTreeObj2);
						
						if (BinaryTree.checkMirrorImage(binaryTreeObj1, binaryTreeObj2))
							System.out.println("Both trees are mirror image of each other.");
						else
							System.out.println("Both trees are not mirror image of each other.");
						break;
			
						/* Exit Case */
					case 5:
						System.out.println("System Exited");
						System.exit(0); // Code to exit the syatem
						break;
				
						/* Default Case */
					default:
						System.out.println("Enter Correct Choice");
						break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}