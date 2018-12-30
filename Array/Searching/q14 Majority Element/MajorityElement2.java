import java.util.Scanner;
import java.util.Stack;

//using stack
public class MajorityElement2{

  public static void main(String args[]) {
    int n,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	n = sc.nextInt();
	int[] arr = new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter the element");
		arr[i] = sc.nextInt();
	}
	
	Stack<Integer> st = new Stack<Integer>();
	
	for(int i=0;i<n;i++){
		if(st.empty()) st.push(arr[i]);
		else {
			if(arr[i] == st.peek()) st.push(arr[i]);
			else temp = st.pop();
		}
	}
	
	if(st.empty()) System.out.println("No Majority element");
	else System.out.println("Majority element exists. Majority element is"+st.pop());
	
	
  }

}