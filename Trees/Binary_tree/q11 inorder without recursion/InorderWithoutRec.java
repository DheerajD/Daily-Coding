import java.util.Stack;

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
	
	public void inorder(Node root) {
		Node current = root;
		Stack<Node> st = new Stack<Node>();
		while(!st.empty() || current!=null) {
			while(current!=null){
				st.push(current);
				current = current.left;
			}
			if(!st.empty()) {
				current= st.pop();
				System.out.print(current.key + "\t");
				current = current.right;
			}
		}
	}	

}

public class InorderWithoutRec {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
			
		System.out.println("\nInorder traversal is : ");
		tree.inorder(tree.root);		
	}
}