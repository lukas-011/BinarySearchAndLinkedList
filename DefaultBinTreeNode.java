
public class DefaultBinTreeNode<T> implements BinTreeNode<T>, Comparable<T>{

	private T data;
	private DefaultBinTreeNode<T> LeftChild = null;
	private DefaultBinTreeNode<T> RightChild = null;
	
	public DefaultBinTreeNode(T obj, DefaultBinTreeNode<T> L, DefaultBinTreeNode<T> R) {
		data = obj;
		LeftChild = L;
		RightChild = R;
	}
	
	public DefaultBinTreeNode(T obj) {
		data = obj;
	}
	
	public DefaultBinTreeNode() {
		
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T set) {
		data = set;
	}

	public DefaultBinTreeNode<T> getLeftChild() {
		return LeftChild;
	}

	public DefaultBinTreeNode<T> getRightChild() {
		return RightChild;
	}

	public void setLeftChild(DefaultBinTreeNode<T> left) {
		LeftChild = left;
	}

	public void setRightChild(DefaultBinTreeNode<T> right) {
		RightChild = right;
	}

	public boolean isLeaf() {
		if(this.getLeftChild() == null && this.getRightChild() == null)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return (String)data;
	}

	public int compareTo(T thing) {
			return 0;
	}
}
