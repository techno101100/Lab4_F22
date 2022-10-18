// Erich Kreiselmeier
/*
 * Java program to implement 
 * a Singly Linked List 
 */

public class LinkedList 
{ 
   
	Node head; // head of list 
    int count;
    
    public LinkedList() 
    {
    	head = null;
    	count = 0;
    }
	/*
	 * Linked list Node. 
	 * This inner class is made static
	 * so that main() can access it 
	 */
	
	class Node
	{
		int data;
		Node next;
		
		// Constructor
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void insert(int data)
	{
		// Create a new node with given data
		
		Node new_node = new Node(data);
		
		/*
		 * If the Linked List is empty,
		 * then make the new node as head
		 */
		
		if (head == null) 
		{
			head = new_node; 
		} else {
			
            /*
             * Else traverse till the last node
             * and insert the new_node there 
             */
			
            Node last = head; 
            while (last.next != null) 
            { 
                last = last.next; 
            } 
   
            // Insert the new_node at last node 
            
            last.next = new_node; 
            count ++;
        } 
	}
	
	public void insertAt (int index, int data) 
	{
		// Create a new node with given data
	
		Node new_node = new Node(data);
		
		/*
		 * If the Linked List is empty,
		 * then make the new node as head
		 */
		
		if (head == null) 
		{
			head = new_node; 
		} else { 

           Node last = head;
           int i = 0;
            while (last.next != null && i < index ) 
            { 
                last = last.next; 
                
                i++;
            } 
            
            if(last.next != null ) 
            {
            	
            	Node temp = last.next; 
            	last.next = new_node;
            	new_node.next = temp;
            	
            } else {
                last.next = new_node;
            }
            
            count ++;
        }
	}
	
	public int remove() 
	{
		if(head == null) 
		{
			return -1;
		}
		int temp = head.data;
		
		if (head.next == null) 
		{
			head = null;
		} else {
			head = head.next;
		}
		count --;
		return temp;
	}
	
	public int get(int index) 
	{
		if (head == null) 
		{
			return -1; 
		} else { 

           Node last = head;
           int i = 0;
            while (last.next != null && i < index ) 
            { 
                last = last.next; 
                
                i++;
            }
    		return last.data;
		}
	}
}