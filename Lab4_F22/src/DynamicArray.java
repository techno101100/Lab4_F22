// Erich Kreiselmeier
public class DynamicArray 
{
	 //private int array[];
	    private int count;
	    private int size;
		private int[] array;
	    // constructor initialize value to variable
	 
	    public DynamicArray()
	    {
	        array = new int[1];
	        count = 0;
	        size = 1;
	    }
	    // function add an element at the end of array
	 
	    public void add(int data)
	    {
	 
	        // check no of element is equal to size of array
	        if (count == size) 
	        {
	            growSize(); // make array size double
	        } // insert element at end of array
	        array[count] = data;
	        count++;
	    }
	 
	    // function makes size double of array
	    public void growSize()
	    {
	 
	        int temp[] = null;
	        if (count == size) 
	        {
	 
	            // temp is a double size array of array
	            // and store array elements
	            temp = new int[size * 2];
	            {
	                for (int i = 0; i < size; i++) 
	                {
	                    // copy all array value into temp
	                    temp[i] = array[i];
	                }
	            }
	        }
	 
	        // double size array temp initialize
	        // into variable array again
	        array = temp;
	        
	        // and make size is double also of array
	        size = size * 2;
	    }
	 
	    // function shrink size of array
	    // which block unnecessary remove them
	    public void shrinkSize()
	    {
	        int temp[] = null;
	        if (count > 0) {
	 
	            // temp is a count size array
	            // and store array elements
	            temp = new int[count];
	            for (int i = 0; i < count; i++) 
	            {
	 
	                // copy all array value into temp
	                temp[i] = array[i];
	            }
	 
	            size = count;
	 
	            // count size array temp initialize 
	            // into variable array again
	            array = temp;
	        }
	    }
	    // function add an element at given index
	 
	    public void addAt(int index, int data)
	    {
	        // if size is not enough make size double
	        if (count == size) {
	            growSize();
	        }
	 
	        for (int i = count - 1; i >= index; i--) 
	        {
	 
	            // shift all element right 
	            // from given index
	            array[i + 1] = array[i];
	        }
	 
	        // insert data at given index
	        array[index] = data;
	        count++;
	    }
	 
	    // function remove last element or put
	    // zero at last index
	    public int remove()
	    {
	    	int retval = 0;
	        if (count > 0) {
	        	retval = array[count-1];
	            array[count - 1] = 0;
	            count--;
	        }
	        return retval;
	    }
	 
	    // function shift all element of right
	    // side from given index in left
	    public int removeAt(int index)
	    {
	        if (count > 0) {
	        	int temp = array[index];
	        	array[index] = 0;
	            for (int i = index; i < count - 1; i++) 
	            {
	 
	                // shift all element of right 
	                // side from given index in left
	                array[i] = array[i + 1];
	            }
	            //array[count - 1] = 0;
	            count--;
	            return temp;
	        }
	        return -1;
	    }
	    
	    public int getCount()
	    {
	    	return count;
	    }
	    
	    public DynamicArray(DynamicArray other) {
	    	this.size = other.size;
	    	this.array = other.array;
	    }
	    public int get(int index) {
			return array[index];
	    } 
	    
	   public String toString() 
	   {
		   String retval = "";
	        for(int i=count -1; i>=0; i--){
	        	retval = retval + array[i]+"\n";
	        }
		   return retval;
	   }
}
