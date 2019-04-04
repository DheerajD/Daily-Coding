//pgm to get first occurence of element in sorted array with duplicates using binary search 

public class BinSearchDup {
	public static void main(String args[]) {
	  int[] arr = {11,42,53,100,105,105,105,105,109,121};
	  int n = arr.length;
	  int x = 105;
	  
	  int index = binSearch(arr,0,n-1,x);
	  if(index != 9999)
	  System.out.println("Element is present at location"+index);
	  else 
  	  System.out.println("Element not present ");
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