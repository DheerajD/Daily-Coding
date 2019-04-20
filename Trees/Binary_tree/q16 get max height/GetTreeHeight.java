
class Node {
	int key;
	Node left, right;
	
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
	
	public int maxHeight(Node root) {
		if(root!=null)
			return Math.max(1+maxHeight(root.left), 1+maxHeight(root.right));
		
		return 0;	//if root is null
	}
}

public class GetTreeHeight{
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.right.left = new Node(10);
		tree.root.right.right.left.left = new Node(10);


			
		int h = tree.maxHeight(tree.root);	
		System.out.println("\nHeight/Depth of the tree is : "+h);
		
	}
}