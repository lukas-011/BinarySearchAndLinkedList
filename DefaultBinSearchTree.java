
public class DefaultBinSearchTree<T> extends DefaultBinTree<T> implements BinSearchTree<T>{
	
	DefaultBinSearchTree(T data) {
		super(data);
	}

	public void insert(T data, DefaultBinTreeNode<T> node) {
		// if data is greater than root data, put right and vice versa
		if((int)data > (int)node.getData()) {
			 if (node.getRightChild() == null)
		          node.setRightChild(new DefaultBinTreeNode<T>(data));
		      else
		          insert(data, node.getRightChild());
		}
		else {
			 if (node.getLeftChild() == null)
		          node.setLeftChild(new DefaultBinTreeNode<T>(data));
		      else
		          insert(data, node.getLeftChild());
		}
	}

	public DefaultBinTreeNode<T> search(T data, DefaultBinTreeNode<T> node) {
		// if the node we're searching is null, return null
		if (node == null)
			return null;
		
		// if the node we're searching has the data we're looking for, return it
		if (node.getData() == data)
			return node;

		// create a new temp node to hold our returned values when recursively calling search
		DefaultBinTreeNode<T> temp = null;
			    
		// if data is greater than our node data, search right
		if((int)data > (int)node.getData())
			temp = search(data, node.getRightChild());
		
		// else, search left
		if (temp == null)
			temp = search(data, node.getLeftChild());

		// return our node
		return temp;
	}

	public T minElement() {
		// set a temp node as our root
		DefaultBinTreeNode<T> node = root;
		
		// create a generic variable to hold our min value
		T min = root.getData();
		
		// while the next left child is not null, get the next left child and set min as the data inside it
		while(node.getLeftChild() != null) {
			node = node.getLeftChild();
			min = node.getData();
		}
		
		// return the min value
		return min;
	}

	
	public T maxElement() {
		// set a temp node as out root
		DefaultBinTreeNode<T> node = root;
		
		// create a generic variable to hold our max value
		T max = root.getData();
		
		// while the next right child is not null, get the next right child and set max as the data inside it
		while(node.getRightChild() != null) {
			node = node.getRightChild();
			max = node.getData();
		}
		
		// return the max value
		return max;
	}
}
