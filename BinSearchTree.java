
public interface BinSearchTree<T> extends BinTree<T>{
	// Insert the data into the tree, maintaining the search tree invariant
	public void insert(T data, DefaultBinTreeNode<T> node);
	
	// Search for data in the tree, finding the node containing it,
	// or null if the data is not present in the tree
	// return the node containing the data or null if none exists
	public DefaultBinTreeNode<T> search(T data, DefaultBinTreeNode<T> node);
	
	// Find the minimum element in the tree
	public T minElement();
	
	// Find the minimum element in the tree
	public T maxElement();
	
}