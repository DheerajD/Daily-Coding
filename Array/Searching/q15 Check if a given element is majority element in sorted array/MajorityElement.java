import java.util.Scanner;

public class MajorityElement {
  public static void main(String args[]){
    int n, i, x;
	int[] arr = {10,22,31,35,40,68,68,68,76,76,76,76,76,76,76,76,76,76,76,101}; //{1,2,3,3,3,3,10};
	n = arr.length;
	x = 76;
	
	checkMajority(arr,n,x);	
  }
  
  public static void checkMajority(int[] arr, int n, int x) {
	int index = binSearch(arr,0,n-1,x);
	if(index!=9999) {
		if( (index + (n/2)) <= (n-1) && (arr[index+(n/2)] == x) ){
		  System.out.println("Majority element "+x+" exists, starting at location "+index);	
		}	
		else System.out.println("Majority element "+x+" does not exists");	
	}
	else  System.out.println("Element "+x+" not found");	
  }

  public static int binSearch(int[] arr, int low, int high, int x) {
		int mid = (low+high)/2;
		if(low<=high) {
			if((mid==0) || (x > arr[mid-1]) && (x == arr[mid]))
				return mid;
			else if( x > arr[mid] ) return binSearch(arr,mid+1,high,x);
			else return binSearch(arr,low,mid-1,x);
		}
		return 9999;
  }
  
  
}