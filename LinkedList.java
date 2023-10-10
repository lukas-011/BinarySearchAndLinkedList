
public class LinkedList<T> implements List<T>{
	LinkedListNode<T> head = new LinkedListNode<T>();
	
	// constructor for head
	LinkedList(T set)
	{
		head.setData(set);
	}
	
	// setters and getters for head node
	public void setHead(T set) {
		head.setData(set);
	}
	
	public LinkedListNode<T> getHead(){
		return head;
	}
		
	// Get data stored in head node of list
	public T getFrist() {
		return head.getData();
	}

	// Get the head node of the list
	public LinkedListNode<T> getFirstNode() {
		return head;
	}

	// Get data stored in the tail node
	public T getLast() {
		// creates a temporary node to copy the values we're currently on
		LinkedListNode<T> current = head;
		
		// find the tail node
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		// return the tail node's data
		return current.getData();
	}

	// Insert a new node with data at the head of the list
	public void insertFirst(T data) {
		// create a new node with its data
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		
		// link the new nodes address to the head
		newNode.setNext(head);
		
		// make the new node the head
		head = newNode;
	}

	// Insert a new node with data after currentNode
	public void insertAfter(LinkedListNode<T> currentNode, T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		
		// Set the new node = the next node for the current
		newNode.setNext(currentNode.getNext());
		
		// set the current node's next = the new node
		currentNode.setNext(newNode);
	}

	// Insert a new node with data at the tail of the list
	public void insertLast(T data) {
		// creates a temporary node to copy the values we're currently on
		LinkedListNode<T> current = head;
		
		// find the tail node
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		// create a new node
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		
		// set the new nodes next = null
		newNode.setNext(null);
		
		// set the tail (current) next = new node
		current.setNext(newNode);
	}

	// Remove head node
	public void deleteFirst() {
		// check if head node is the tail
		if(head.getNext() == null)
		{
			return;
		}
		// Get the next node in a temp node
		LinkedListNode<T> temp;
		temp = head.getNext();
		
		// set the next node = head
		
		head = temp;
		
	}

	// Remove tail node
	public void deleteLast() {
		// creates a temporary node to copy the values we're currently on
		LinkedListNode<T> current = head;
		LinkedListNode<T> previous = null;
		
		// Return if the head is the tail
		if(current.getNext() == null)
		{
			return;
		}
		else
		{
		// find the tail node
		while(current.getNext() != null)
		{
			// set previous = current
			previous = current;
			
			// current is set to the one after previous
			current = current.getNext();
		}
		
		// Set previous's next = null
		previous.setNext(null);
		}
	}

	// Remove node following currentNode
	// If no node exists do nothing
	public void deleteNext(LinkedListNode<T> currentNode) {
		LinkedListNode<T> temp = null;
		
		// get the node after the next
		// check to see if the next node is null
		
		temp = currentNode.getNext();
		
		if(temp == null) 
			return;
		else 
			currentNode.setNext(temp.getNext());
	}

	// Get the number of elements in this list
	public int size() {
		int size = 1; // holds the size
		// creates a temporary node to copy the values we're currently on
		LinkedListNode<T> current = head;
		
		// find the tail node
		while(current.getNext() != null)
		{
			current = current.getNext();
			size++;
		}
		// return the tail node's data
		return size;
	}

	// Check if list is empty
	public boolean isEmpty() {
		if(head.getNext() == null)
			return true;
		else
			return false;
	}	
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    LinkedListNode<T> current = head;
	    
	    // While current doesn't = null put the data on the string
	    while (current != null) 
	    {
	    sb.append(current.getData()).append(" -> ");
	      current = current.getNext();
	      
	    }
	    return sb.toString();
	}

}
