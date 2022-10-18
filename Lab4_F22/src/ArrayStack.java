// Erich Kreiselmeier
public class ArrayStack implements StackInterface 
{
 
	private DynamicArray stack; // the last element of the array is the top
	
	 public ArrayStack(ArrayStack other) 
	 {
		 stack = other.stack;
		 
		 // count = other.count; may need or not
	 }
	
	public ArrayStack()

	{

		stack = new DynamicArray();

	}

	public void push(int element)
	
	{
			

		stack.add(element);

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

		return stack.get(stack.getCount () - 1); // just Check

	}

	

	public boolean isEmpty()

	{
		return stack.getCount() == 0;

	}

	

	public int size()
	
	{

		return stack.getCount();

	}


	@Override
	public void clear() 
	
	{
		stack = new DynamicArray();

	}
	
	public String toString()

    {
		return stack.toString();
    }
}