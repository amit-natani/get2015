import java.util.*;

public class BinaryTree {
	
	/* root is a reference varibale of type node */
	public Node root;
	
	/** This list contains the preorder traversal of tree */
	public static List<Integer> preorderList = new ArrayList<Integer>();
	
	/** This list contains the postorder traversal of tree */
	public static List<Integer> postorderList = new ArrayList<Integer>();
	
	static String firstTreeTraversal = "";
	static String secondTreeTraversal = "";
	
	/* No Argument constructor to create object of class BinarySearchTree */
	public BinaryTree() {
		root = null;
	}
	
	/** Method to insert data in the tree
	 * 
	 * @param data : Data to be insertde in the tree
	 */
	public void insert(int data) {
		
		/* newNode will store the data to be added */
		Node newNode = new Node();
		newNode.setData(data);
		
		/* If root contains null, then 
		 * newNode will be assigned to root
		 */
		if (root == null)
			root = newNode;
		
		/* If root is not null, then this code will be executed */
		else {
			
			/* currentNode will hold root node */  
			Node currentNode = root;
			Node parentNode;
			while (true) {
				parentNode = currentNode;
				
				/* condition to compare the data to be inserted and data of currentNode */
				if (data < (Integer)currentNode.getData()) {
					
					/* if data is less than data of current node than
					 * left subtree is choosen
					 */
					currentNode = currentNode.getLeft();
					if (currentNode == null) {
						parentNode.setLeft(newNode);
						break;
					}
				}
				else {
					/* if data is greater than data of current node than
					 * right subtree is choosen
					 */
					currentNode = currentNode.getRight();
					if (currentNode == null) {
						parentNode.setRight(newNode);
						break;
					}
				}
			}
		}
	}
	
	/** Method to traverse the tree in preorder
	 * 
	 * @param node : root node of the tree
	 */
	public void preOrder(Node node) {
		
		if (node != null) {
			/* preorderList contains preorder traversal of tree */
			preorderList.add((Integer)node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	/** Method to traverse the tree in postorder
	 * 
	 * @param node : root node of tree
	 */
	public void postOrder(Node node) {
		if (node != null) {
			/* postorderList contains postorder traversal of tree */
			postOrder(node.getLeft()); 
			postOrder(node.getRight());
			postorderList.add((Integer)node.getData());
		}
	}
	
	/** Method to insert nodes in the mirror tree 
	 * 
	 * @param data :  data to be added
	 */
	public void insertInMirrorTree(int data) {
		
		/* newNode will store the data to be added */
		Node newNode = new Node();
		newNode.setData(data);
		
		/* If root contains null, then 
		 * newNode will be assigned to root
		 */
		if (root == null)
			root = newNode;
		
		/* If root is not null, then this code will be executed */
		else {
			
			/* currentNode will hold root node */ 
			Node currentNode = root;
			Node parentNode;
			while (true) {
				
				parentNode = currentNode;
				/* condition to compare the data to be inserted and data of currentNode */
				if (data >= (Integer)currentNode.getData()) {
					
					/* if data is less than data of current node than
					 * left subtree is choosen
					 */
					currentNode = currentNode.getLeft();
					/* if current is null then assign newNode to parent */
					if (currentNode == null) {
						parentNode.setLeft(newNode);
						break;
					}
				}
				else {
					
					/* if data is greater than data of current node than
					 * right subtree is choosen
					 */
					currentNode = currentNode.getRight();
					if (currentNode == null) {
						parentNode.setRight(newNode);
						break;
					}
				}
			}
		}
	}
	
	/** Method to compare two trees whether they are mirror image or not 
	 * Trees will mirror image to each other if preorder traversal of one tree is equal to
	 * reverse of postorder traversal of other tree or
	 * postorder traversal of one tree is equal to reverse of preorder traversal of other tree
	 * or inorder traversal of one tree is equal to reverse of inorder of other tree
	 * 
	 * @param binaryTreeObj1 : Object of first tree
	 * @param binaryTreeObj2 : Object of second tree
	 * @return true if trees are mirror image, false otherwise
	 */
	public static boolean checkMirrorImage(BinaryTree binaryTreeObj1,
			BinaryTree binaryTreeObj2) {
		
		/* Computing preorder traversal of first tree contained in binaryTreeObj1 */
		binaryTreeObj1.preOrder(binaryTreeObj1.root);
		
		/* Computing preorder traversal of second tree contained in binaryTreeObj2 */
		binaryTreeObj2.postOrder(binaryTreeObj2.root);
		
		for (Integer i : preorderList) {
			firstTreeTraversal += i;
		}
		for (int i = postorderList.size() - 1; i >= 0; i--) {
			secondTreeTraversal += postorderList.get(i);
		}

		/* Comparing traversal of both trees for mirror images */
		if (firstTreeTraversal.equals(secondTreeTraversal))
			return true;
		else
			return false;
	}
}