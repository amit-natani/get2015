
public class Queue {
	int front, rear;
	Object array[];
	Object arrayNew[];

	public Queue(int numberOfElements)
	{
		front = 0;
		rear = 0;
		array = new Object[numberOfElements];
	}
	
	public Queue()
	{
		front = 0;
		rear = 0;
		array = new Object[10];
	}
	
	/** Method to add an item to list
	 * @param object : object to add to the list
	 * @return true if item is added successfully, false otherwise
	 */
	public boolean enqueue(Object object)
	{
		try
		{
			int length = array.length;
			if(rear < length) {
				array[rear] = object;
				rear++;
			}
			else 
			{
				arrayNew = new Object[length*2+2];
				for(int i = 0; i < length; i++)
					arrayNew[i] = array[i];
				array = arrayNew;
				array[rear] = object;
				rear++;
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** Method to remove front element from queue
	 * 
	 * @return front element
	 */
	public Object dequeue()
	{
		Object temp = array[front];
		front++;
		return temp;
	}
	
	/** Method to get the front element of the queue
	 * 
	 * @return front element
	 */
	public Object getFront()
	{
		return array[front];
	}
	
	/** Method to make the queue empty */
	public void makeEmpty()
	{
		try
		{
			front = 0;
			rear = 0;
			array = new Object[10];
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
	
	/** Method to Show the queue */
	public void show()
	{
		for(int i = front; i < rear; i++)
		{
			System.out.print(array[i]+"\t");
		}
	}
}
