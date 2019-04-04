class MaxMin2 {
	int max;
	int min;
	
	public MaxMin2() {
	  max = Integer.MIN_VALUE;
	  min = Integer.MAX_VALUE;
	}
}

public class EvalMaxMin2 {
	public static void main(String args[]) {
		int[] arr = {186,98,2,10,3,65,34,9,-1,78};
		int n = arr.length;
	
		MaxMin2 x = getMaxMin(arr,n);
		System.out.println("Max element is "+x.max+" min element is "+x.min);
	}
	
	
	public static MaxMin2 getMaxMin(int[] arr, int n) {
		int max_val;
		int min_val;
		int i;
		if(n%2 == 0){
			if(arr[0]>arr[1]) {
				max_val = arr[0];
				min_val = arr[1];
			}
			else {
				max_val = arr[1];
				min_val = arr[0];
			}
			i = 2;
		}
		
		else {
			max_val = arr[0];
			min_val = arr[0];
			i=1;
		}
		
		while(i<n) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > max_val) max_val = arr[i]; 
				if(arr[i+1] < min_val) min_val = arr[i+1];
			}
			else {
				if(arr[i+1] > max_val) max_val = arr[i+1];
				if(arr[i] < min_val) min_val = arr[i];
			}
			
			i= i+2;
		}
		MaxMin2 m = new MaxMin2();
		m.max = max_val;
		m.min = min_val;
		return m;
	}	
}



