import java.util.Scanner;
import java.util.Arrays;
//using sorting of elements in array

public class MajorityElement {

  public static void main(String args[]) {
    int n,count=0;
	boolean flag = false;
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array ");
	n = sc.nextInt();
	int[] arr = new int[n];
	
	for(int i=0;i<n;i++) {
	  System.out.println("Enter the element");
	  arr[i] = sc.nextInt();
	 }
	
	Arrays.sort(arr);
	
	for(int i=0; i<n-1; i++) {
		if(arr[i] == arr[i+1]) {
			count++; 	
		}
		else {
			if(count > (n/2)) {
			System.out.println("Majority element exists. Majority element is "+arr[i]);
		    flag = true;
			break;
			}
		}
	}
	
	if(!flag) System.out.println("No majority element exists");
	
	}
}

