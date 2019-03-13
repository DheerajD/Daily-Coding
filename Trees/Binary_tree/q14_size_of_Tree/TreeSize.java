public class TreeSize {
	
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(7);
		
		System.out.println("Size of tree is : "+tree.getSize(tree.root));
		
		System.out.println("Size of tree is : "+tree.getSize(tree.root.left));//this should return 3
	}

}

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}


class BinaryTree {
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public int getSize(Node root) {
		if(root==null)
			return 0;
		else 
			return 1+ getSize(root.left)+ getSize(root.right);
	}
}