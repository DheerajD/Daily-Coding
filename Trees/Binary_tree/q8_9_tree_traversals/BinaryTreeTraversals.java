import java.util.LinkedList;
import java.util.Queue;


class Node {
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
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
		
	}

	public BinaryTree() {}
	
	public void preorder(Node root) {
		if(root!=null) {
			System.out.print("\t"+root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print("\t"+root.data);
			inorder(root.right);
		}
	}
	
	public void postorder(Node root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print("\t"+root.data);
		}
	}
	
	public void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		if(root!=null)
			q.add(root);
		else return;
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print("\t"+temp.data);
			
			if(temp.left!=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}

}


public class BinaryTreeTraversals {
	
	public static void main(String args[]) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		System.out.println("\nPreorder traversal is : ");
		tree.preorder(tree.root);
		
		System.out.println("\nInorder traversal is : ");
		tree.inorder(tree.root);
		
		System.out.println("\nPostorder traversal is : ");
		tree.postorder(tree.root);
		
		System.out.println("\nLevelOrder traversal is : ");
		tree.levelOrder(tree.root);
		
	}
	

}