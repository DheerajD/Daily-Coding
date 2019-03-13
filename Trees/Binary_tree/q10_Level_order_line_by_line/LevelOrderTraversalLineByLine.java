import java.util.*;

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
	
	
	public void levelOrderLineByLine(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			int l = q.size();
			while(l>0){
				Node temp = q.poll();
				System.out.print("\t"+temp.data);
				
				if(temp.left!=null)
					q.add(temp.left);
				
				if(temp.right!=null)
					q.add(temp.right);
				l--;
			}
			System.out.println("");
		}
	}
}


public class LevelOrderTraversalLineByLine {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.right = new Node(6);
		System.out.println("Level order traversal is : ");
		tree.levelOrderLineByLine(tree.root);
	}
	
}