import java.util.Iterator;
import java.util.List;
/**
 * @author Amit
 *
 */

public class Linked_List_Operations{
	
	/** Method to insert element at correct position in linked list
	 * 
	 * @param index : the index at which the element is checked 
	 * to be inserted, if it is correct and according to sorting
	 * then the element is inserted at this index
	 * @param element : element to be inserted
	 * @param list : sorted linked list in which element is to be inserted
	 */
	public void insert(int index, int element, List<Integer> list) {
		
		/* If index becomes equal to list size then element
		 * will be added to list directly*/
		if(index == list.size())
			list.add(element);
		
		/* if element i greater than the element at the index
		 * then method will be recurcively called with increased index
		 */
		else if((int)list.get(index) < element)
			insert(index+1, element, list);
		
		/* If element less than or equal to current element then 
		 * it will be added to the list
		 */
		else
			list.add(index, element);
	}
	
	/** Method to display the elements of the list 
	 * 
	 * @param list : linked list whose elements are to be displayed
	 */
	public void display(List<Integer> list) {
		
		/* Interator obejct to iterate through the list */
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			
			/* Displaying elements of list one by one */
			System.out.println(iterator.next());
		}
	}
}
