//Program to check if a given LL has a loop.
//Dheeraj Doodhya
//Here I have coded 2 methods, one using hashSet and other one using Floyed cycle finding algo. There is one method where we mark the visited nodes and check if a node has already been visited. But this approach involves modification of node
//Floyed cycle detection - use 2 pointers.. one wil move one step and other one 2 steps. If they meet at some point there is a loop, else no loop.

import java.util.*;

class Node {
	int data;
	Node next;
	
	public Node(int x) {
		data = x;
		next = null;
	}
}

class LinkedList {
	Node start;

	public LinkedList() {
		start = null;
	}
	
	public Node addToStart(int x) {
		Node newnode = new Node(x);
		
		if(start==null){
			newnode.next = null;
			start = newnode;
		}
		else {
			newnode.next = start;
			start = newnode;
		}
		
		return start;
	}
	
	public void traverse(Node start) {
		Node temp = start;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public static boolean checkloop1(Node start){		//Using Hashset
		HashSet<Node> hs = new HashSet<Node>();
		
		Node temp = start;
		while(temp!=null) {
			if(hs.contains(temp)) {
				return true;
			}
			else {
				hs.add(temp);
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static boolean checkloop2(Node start) {		//Floyed Cycle detection method
		Node temp1 = start, temp2 = start;
		
		while(temp1!=null && temp1.next!=null) {
			temp1 = temp1.next.next;
			temp2 = temp2.next;
			
			if(temp1 == temp2)
				return true;
		}
		return false;
	}
}

public class DetectLoopInLL {
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		
		l1.start = l1.addToStart(10);
		l1.start = l1.addToStart(20);
		l1.start = l1.addToStart(30);
		l1.start = l1.addToStart(40);
		l1.start = l1.addToStart(50);
		
		//l1.traverse(l1.start);
		
		//now here I am creating a loop		
		l1.start.next.next.next.next = l1.start;
		
		boolean hasLoop = LinkedList.checkloop2(l1.start);
		System.out.println("Loop present : " + hasLoop);
	}
}