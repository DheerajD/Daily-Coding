public class CheckIdentical {
	
	public static void main(String args[]){
		BinaryTree bt1 = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();
		BinaryTree bt3 = new BinaryTree();

		bt1.root = new Node(1);
		bt2.root = new Node(1);
		bt3.root = new Node(1);
	
		bt1.root.left = new Node(2);
		bt1.root.right = new Node(3);
		bt1.root.left.left = new Node(4);
		bt1.root.left.right = new Node(5);
	
		bt2.root.left = new Node(2);
		bt2.root.right = new Node(3);
		bt2.root.left.left = new Node(4);
		bt2.root.left.right = new Node(5);
		
		bt3.root.left = new Node(2);
		bt3.root.right = new Node(3);
		bt3.root.left.left = new Node(4);
		bt3.root.left.right = new Node(6);
		
		System.out.println("Identical? "+checkIdentical(bt1.root, bt2.root));
		System.out.println("Identical? "+checkIdentical(bt1.root, bt3.root));


	}
	
	public static boolean checkIdentical(Node root1, Node root2) {
		if(root1==null && root2==null)
			return true;
		else if((root1!=null && root2==null)||(root1==null && root2!=null))
			return false;
		else {
			boolean flag = (root1.data == root2.data);
			return flag && checkIdentical(root1.left, root2.left) && checkIdentical(root1.right, root2.right);
		}		
	}	
}

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
		right = null;
		left = null;
	}
}

class BinaryTree {
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
}