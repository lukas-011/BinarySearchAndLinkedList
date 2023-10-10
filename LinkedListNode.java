
public class LinkedListNode<T> {

	private T data; // data for the node
	private LinkedListNode<T> next; // address for the next node
	
	// Constructors for nodes
	public LinkedListNode() {
		data = null;
		next = null;
	}
	
	public LinkedListNode(T set) {
		data = set;
		next = null;
	}
	
	// Gets data
	public T getData() {
		return data;
	}
	
	// Sets data
	public void setData(T set) {
		data = set;
	}
	
	// Gets next node
	public LinkedListNode<T> getNext() {
		return next;
	}
	
	// Sets next node
	public void setNext(LinkedListNode<T> set) {
		next = set;
	}
}
