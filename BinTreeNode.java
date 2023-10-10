public interface BinTreeNode<T> {
	// Get the data stored at this node
	public T getData();
	
	public void setData(T set);
	// Get the left child
	public DefaultBinTreeNode<T> getLeftChild();
	
	// Get the right child
	public DefaultBinTreeNode<T> getRightChild();
	
	// Set the left child
	public void setLeftChild(DefaultBinTreeNode<T> left);
	
	// Set the right child
	public void setRightChild(DefaultBinTreeNode<T> right);
	
	// Tests if this node is a leaf
	public boolean isLeaf();
}
