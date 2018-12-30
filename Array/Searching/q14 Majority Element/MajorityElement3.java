import java.util.Scanner;

public class MajorityElement3{

  public static void main(String args[]) {
    int n,count=0,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array ");
	n = sc.nextInt();
	int[] arr = new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter the element");
		arr[i] = sc.nextInt();
	}
	
	count = 1;
	temp = arr[0];
	for(int i=1;i<n;i++) {
	  if(count>0) {
		if(temp == arr[i]) count++;
		else count--;
	  }
	  
	  if(count == 0) {
		  temp = arr[i];
		  count = 1;
	  }
	}
	//now temp is either the last element or some other element or a candidate for majority element
    int count_temp=0;
	for(int i=0;i<n;i++) {
		if(arr[i] == temp) count_temp++;
	}
	if(count_temp > n/2) System.out.println("Majority element exists.Majority element is "+temp);
	else System.out.println("No majority element exists.");
  }
}