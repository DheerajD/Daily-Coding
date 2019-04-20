
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
	
	public boolean checkProp(Node root) {
		int left_val=0, right_val=0; 
		if((root == null)||(root.left == null && root.right == null))
			return true;
		else {
			if(root.left != null)
				left_val = root.left.key;
			
			if(root.right!=null)
				right_val = root.right.key;
			
			return ((root.key == left_val+right_val) && checkProp(root.left) && checkProp(root.right));
		}
		
	}
	
}

public class CheckSumProp {
	public static void main(String args[]) {
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(3);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(5);
		tree1.root.right.left = new Node(6);
		tree1.root.right.right = new Node(7);
		System.out.println("\nSatisifies property ?  : "+tree1.checkProp(tree1.root));	

		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(2);
		System.out.println("\nSatisifies property ?  : "+tree.checkProp(tree.root));	

	}
}