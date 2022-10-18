// Erich Kreiselmeier
public class ListStack implements StackInterface 
{

    
	private LinkedList stack; // the last element of the array is the top
	

	
	 public ListStack(ListStack other) 
	 {
		 stack = other.stack;
		 
		 // count = other.count; may need or not
	 }
	

	public ListStack()

	{

		stack = new LinkedList();

	}

	public void push(int element)
	
	{
			

		stack.insertAt(0, element);

	}


	public int pop() {
		if (!isEmpty())
			return -1;

		int result = stack.remove();

		return result;

	}

	public int peek()

	{

		if (isEmpty())

			return -1;

		return stack.get(stack.count - 1); // just Check

	}

	

	public boolean isEmpty()

	{
		return stack.count == 0;

	}

	

	public int size()
	
	{

		return stack.count;

	}


	@Override
	public void clear() 
	
	{
		stack = new LinkedList();

	}
	
	public String toString()

    {
		return stack.toString();
    }
}