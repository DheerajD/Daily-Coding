import java.util.Arrays;

public class SumCloseTo0{
  public static void main(String args[]) {
	int n, i,low,high,sum,abs_val=9999,x1=-999,x2=-999;
	int[] arr = {-6,-18,4,5,62,9,-8,12,2};
	n = arr.length;
	Arrays.sort(arr);
	
	low = 0;
	high = n-1;
	sum = -9999;
	int abs_temp = 0;
	while(low!=high) {
		sum = arr[low]+arr[high];
		abs_temp = Math.abs(sum);
		if(abs_temp < abs_val) {
			abs_val = abs_temp;
			x1 = arr[low]; x2 = arr[high];
		}
		if(sum < 0) low++;
		else if (sum > 0) high--;
		else if(sum == 0) break;
	}
	
	System.out.println("The two numbers whose sum is closest to zero are: "+x1+" and "+x2);	
  } 
}
