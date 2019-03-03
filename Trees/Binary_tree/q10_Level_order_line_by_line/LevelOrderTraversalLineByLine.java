class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int d) {
		data = d;
		left = null;
		right = null;
	}
	
	public Node() {
		left = null;
		right = null;
	}
}


class BinaryTree {
	Node root;
	
	public BinaryTree(int d) {
		root.data = d;
		root.left = null;
		root.right = null;
	}
	
	public void LevelOrderLineByLine(Node root) {
		Queue<Node> q = new LinkedList<Node>();
	}

}