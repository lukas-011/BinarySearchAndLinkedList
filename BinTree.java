public interface BinTree<T> {
	public DefaultBinTreeNode<T> getRoot();
	
	// Set the root node for this tree
	public void setRoot(DefaultBinTreeNode<T> set);
	
	// Test if tree is empty
	public boolean empty();
	
	// Get the data of this tree using inorder traversal
	public LinkedList<T> inorderTraversal(LinkedList<T> link, DefaultBinTreeNode<T> root);
	
	// Get the data of this tree using preorder traversal
	public LinkedList<T> preorderTraversal(LinkedList<T> link, DefaultBinTreeNode<T> root);
	
	// Get the data of this tree using postorder traversal
	public LinkedList<T> postorderTraversal(LinkedList<T> link, DefaultBinTreeNode<T> root);
	
	// Print the tree using inorder traversal
	public String inorderString(String string, DefaultBinTreeNode<T> root);
	
	// Print the tree using preorder traversal
	public String preorderString(String string, DefaultBinTreeNode<T> root);
	
	// Print the tree using postorder traversal
	public String postorderString(String string, DefaultBinTreeNode<T> root);
}
