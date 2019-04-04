import java.util.Scanner;

public class CountInv {
	
	
	public static void main(String args[]) {
		int n,i,inv_num;
		int[] arr = {2,4,1,3,5};//{45,31,60,2,5,9,18,11,23};
		n = arr.length;
		int[] temp = new int[n];
		inv_num = countInv(arr,temp,0,n-1);
		System.out.println("Number of inversions in the array is "+inv_num);
		System.out.println("Sorted Array is\n");
		for(int j=0;j<n;j++) System.out.print("\t"+temp[j]);

	}
	
	public static int countInv(int[] arr, int[] temp, int low, int high) {
		int count_inv  = 0;
		int mid = low + (high-low)/2 ; 
		
		if(low<high) {
			count_inv = countInv(arr, temp, low, mid);
			count_inv = count_inv + countInv(arr, temp, mid+1, high);
			count_inv = count_inv + merge(arr, temp, low, high, mid);
		}
		return count_inv;
	}
	
	public static int merge(int[] arr, int[] temp, int low, int high, int mid) {
		int i,j,ptr,count=0;
		i = low;
		j = mid+1;
		ptr = low;
		
		while((i<=mid)&&(j<=high)) {
			if(arr[i]<=arr[j]) {
				temp[ptr++] = arr[i++];
			}
			else {
				temp[ptr++] = arr[j++];
				count = count+ (mid-low);
			}
		}
		
		while(i<=mid) {
			temp[ptr++] = arr[i++];
		}
		
		while(j<=high) {
			temp[ptr++] = arr[j++];
		}
		return count;
	}
	
	
	
	
}