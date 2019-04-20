import java.util.Queue;
import java.util.LinkedList;

class Node {
	int key;
	Node left, right;
	int count = 0;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}


class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(int key) {
		root = new Node(key);
	}
	
	
	public int getLeafCount(Node root) {
		if(root == null)
			return 0;
		else if(root.left == null && root.right == null)
			return 1;
		else 
			return (getLeafCount(root.left) + getLeafCount(root.right));
	}	

}

public class CountLeafNodes {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
			
		System.out.println("\nNumber of leaf nodes : "+tree.getLeafCount(tree.root));
		
	}
}