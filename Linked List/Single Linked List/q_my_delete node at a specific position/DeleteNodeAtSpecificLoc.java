//code to delete a node of linked list at a specific position
//Dheeraj Doodhya
import java.util.Scanner;

class Node {
	int data ;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public Node addToHead(int data) {
		Node newnode = new Node(data);
		
		if(head==null){
			newnode.next = null;
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
		return head;
	}
	
	public Node deleteSpecificPos(int p) {
		return null;
	}
	
	public void trav() {
		Node temp = head;
		while(temp != null){
			System.out.print("\t" + temp.data);
		}
	}
}

public class DeleteNodeAtSpecificLoc {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes in linkedlist");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		LinkedList l1 = new LinkedList();
		
		System.out.println("Enter node n node values");
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			l1.addToHead(x);
		}
		System.out.println("Linked List is : ");
		l1.trav();
		System.out.println("");
		
		System.out.println("Enter the position where you want to perform deletion");
		int p = sc.nextInt();
		
		//l1.deleteSpecificPos(p);
		
		System.out.println("Linked List after deletion : ");
		l1.trav();
		System.out.println("");
		
	}
}