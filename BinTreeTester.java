import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinTreeTester {
	
	@Test
	void test() {
		// setting up a binary search tree with 12 as the root
		DefaultBinSearchTree tree = new DefaultBinSearchTree(12);
		
		//************************************************************************************************************
		// Testing the insert method
		tree.insert(8, tree.getRoot());
		tree.insert(7, tree.getRoot());
		tree.insert(10, tree.getRoot());
		tree.insert(15, tree.getRoot());
		tree.insert(14, tree.getRoot());
		tree.insert(16, tree.getRoot());
		
		// Should make a tree like this
		//					12
		//				  /    \
		//               8	   15
		//				/ \	   / \
		//			   7  10  14  16
		
		String test1string = "";
		
		assertEquals("Test 1", " 7 8 10 12 14 15 16",tree.inorderString(test1string, tree.getRoot()));
		//************************************************************************************************************
		
		// Testing the search method, should return a DefaultBinTreeNode with the data value 14
		DefaultBinTreeNode newNode = tree.search(14, tree.getRoot());
		
		assertEquals("Test 2", 14, newNode.getData());
		
		//************************************************************************************************************
		
		// Testing the minElement method, should return the value 7
		assertEquals("Test 3", 7, tree.minElement());
		
		//************************************************************************************************************
		
		// Testing the maxElement method, should return the value 16
		assertEquals("Test 4", 16, tree.maxElement());
		
	}
}
