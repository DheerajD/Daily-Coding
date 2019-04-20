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
	
	
	public void printPaths(Node node, int[] path, int len) {
		if(node==null)
			return;
		
			path[len] = node.key;
			len++;
		
		if(node.left==null && node.right==null) {
			printArr(path,len);
		}
		else {
			printPaths(node.left, path, len);
			printPaths(node.right, path, len);
		}
	}

	public void printArr(int[] path, int len) {
		for(int i=0; i<len; i++)
			System.out.print(path[i]+" ");
		System.out.println(" ");
	}

}

public class AllPaths {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		int[] path = new int[1000];
		int len = 0;
			
		System.out.println("\nRoot to leaf all paths: ");
		tree.printPaths(tree.root, path, len);		
	}
}