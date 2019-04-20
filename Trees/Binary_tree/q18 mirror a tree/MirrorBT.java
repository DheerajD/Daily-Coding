import java.util.Queue;
import java.util.LinkedList;

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
	
	public Node mirror(Node node) {
		if(node==null)
			return node;
			
		Node left_subtree = mirror(node.left);
		Node right_subtree = mirror(node.right);
		
		node.left = right_subtree;
		node.right = left_subtree;
				
		return node;
	}
	
	public void inorder(Node root) {
		if(root!=null) {
		  inorder(root.left);
		  System.out.print("\t"+root.key);
		  inorder(root.right);  
	  }	  	
	}	

}

public class MirrorBT {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
			
		System.out.println("\nInorder traversal before mirroring is : ");
		tree.inorder(tree.root);
		
		BinaryTree tree2 = new BinaryTree();
		tree2.root = tree.mirror(tree.root);
		
		System.out.println("\nInorder traversal after mirroring is : ");
		tree2.inorder(tree2.root);			
	}
}