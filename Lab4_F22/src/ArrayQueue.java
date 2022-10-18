// Erich Kreiselmeier
public class ArrayQueue implements QueueInterface
{

    
	private DynamicArray queue; // the last element of the array is the top

	 public ArrayQueue(ArrayQueue other) 
	 {
		 queue = other.queue;
		 
		 // count = other.count; may need or not
	 }
	
	public ArrayQueue()

	{

		queue = new DynamicArray();

	}

	public void enqueue(int element)
	
	{
			

		queue.add(element);

	}


	public int dequeue() 
	
	{
		if (!isEmpty())
			return -1;

		int result = queue.removeAt(0);

		return result;

	}

	public int peek()

	{

		if (isEmpty())

			return -1;

		return queue.get(queue.getCount () - 1); // just Check

	}

	

	public boolean isEmpty()

	{
		return queue.getCount() == 0;

	}

	

	public int size()
	
	{

		return queue.getCount();

	}


	
	public void clear() 
	
	{
		queue = new DynamicArray();

	}
	
	public String toString()

    {
		return queue.toString();
    }
}