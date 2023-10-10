
public class DefaultBinTree<T> implements BinTree<T>{
	
	protected DefaultBinTreeNode<T> root = new DefaultBinTreeNode<T>();
	
	DefaultBinTree(T data){
		root.setData(data);
	}
	
	DefaultBinTree(){
		root = null;
	}
	
	public DefaultBinTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(DefaultBinTreeNode<T> set) {
		root = set;
	}

	public boolean empty() {
		if(root == null)
			return false;
		else
			return true;
	}

	public LinkedList<T> inorderTraversal(LinkedList<T> link, DefaultBinTreeNode<T> node) {
		// defined recursively
		// if node is null that is our base case
		if(node == null) {
			return link;
		}
		
		// L, root, R
		link = inorderTraversal(link, node.getLeftChild());
		link.insertLast(node.getData());
		link = inorderTraversal(link, node.getRightChild());
		
		return link;
	}

	public LinkedList<T> preorderTraversal(LinkedList<T> link, DefaultBinTreeNode<T> node) {
		if(node == null) {
			return link;
		}
		
		// root, L, R
		link.insertLast(node.getData());
		link = inorderTraversal(link, node.getLeftChild());
		link = inorderTraversal(link, node.getRightChild());
		
		return link;
	}

	public LinkedList<T> postorderTraversal(LinkedList<T> link, DefaultBinTreeNode<T> node) {
		if(node == null) {
			return link;
		}
		
		// L, R, root
		link = inorderTraversal(link, node.getLeftChild());
		link = inorderTraversal(link, node.getRightChild());
		link.insertLast(node.getData());
		
		return link;
	}

	public String inorderString(String string, DefaultBinTreeNode<T> node) {
		if(node == null) {
			return string;
		}
		
		// L, root, R
		string = inorderString(string, node.getLeftChild());
		string = string + " " + node.getData();
		string = inorderString(string, node.getRightChild());
		
		return string;
	}

	public String preorderString(String string, DefaultBinTreeNode<T> node) {
		if(node == null) {
			return string;
		}
		
		// root, L, R
		string = string + " " + node.getData();
		string = inorderString(string, node.getLeftChild());
		string = inorderString(string, node.getRightChild());
		
		return string;
	}

	public String postorderString(String string, DefaultBinTreeNode<T> node) {
		if(node == null) {
			return string;
		}
		
		// L, R, root
		string = inorderString(string, node.getLeftChild());
		string = inorderString(string, node.getRightChild());
		string = string + " " + node.getData();
		
		return string;
	}

}
