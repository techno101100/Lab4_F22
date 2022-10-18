// Erich Kreiselmeier
public class ListQueue implements QueueInterface
{

    
	private LinkedList queue; // element 


	 public ListQueue(ListQueue other) 
	 {
		 queue = other.queue;
		 
		 // count = other.count; may need or not
	 }

	public void enqueue(int element)
	
	{
			

		queue.insert(element);

	}


	public int dequeue() 
	
	{
		if (!isEmpty())
			return -1;

		int result = queue.remove();

		return result;

	}

	public int peek()

	{

		if (isEmpty())

			return -1;

		return queue.get(queue.count - 1); // just Check

	}

	

	public boolean isEmpty()

	{
		return queue.count == 0;

	}

	

	public int size()
	
	{

		return queue.count;

	}

	
	public void clear() 
	
	{
		queue = new LinkedList();

	}
	
	public String toString()

    {
		return queue.toString();
    }
}