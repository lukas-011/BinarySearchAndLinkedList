
public interface List<T> {
	
	// Get data stored in head node of list
	public T getFrist();
	
	// Get the head of the list
	public LinkedListNode<T> getFirstNode();
	
	// Get data stored in tail node of list
	public T getLast();
	
	// Insert a new node with data at the head of the list
	public void insertFirst(T data);
	
	// Insert a new node with data after currentNode
	public void insertAfter(LinkedListNode<T> currentNode, T data);
	
	// Insert a new node with data at the tail of the list
	public void insertLast(T data);
	
	// Remove head node
	public void deleteFirst();
	
	// Remove tail node
	public void deleteLast();
	
	// Remove node following currentNode
	// If no node exists do nothing
	public void deleteNext(LinkedListNode<T> currentNode);
	
	// Get the number of elements in this list
	public int size();
	
	// Check if the list is empty
	public boolean isEmpty();
}
