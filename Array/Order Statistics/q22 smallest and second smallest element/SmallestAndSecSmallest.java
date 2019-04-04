import java.util.Arrays;

public class SmallestAndSecSmallest {
	public static void main(String args[]) {
	int n;
	int[] arr = {98,65,91,23,-67,11,-3,0,31,-43,-11,2};
	n = arr.length;
	
	printSmallestAndSecSmallest(arr, n);
	}
	
	public static void printSmallestAndSecSmallest(int[] arr, int n){
	  int min, secmin;
	  min = 999;
	  secmin = 999;
	  for(int i = 0; i<n; i++) {
		  
		/* If current element is smaller than first
then update both first and second */		  
	    if(arr[i] < min ) {
			secmin = min;
		  min = arr[i];
		}

		/* If arr[i] is in between first and second
then update second */
		else if(arr[i]<secmin && arr[i]>min) {
			secmin = arr[i];
		}
	  }
	  System.out.println("Smallest element is "+min+" and second smallest element is "+secmin);
	}
}