import java.util.Scanner;
import java.util.Arrays;

public class CheckPair {

 public static void main(String args[]) {
   int n,x;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value of x ");
   x = sc.nextInt();
   System.out.println("Enter the number of elements in the array");
   n = sc.nextInt();
   int[] arr = new int[n];
   for(int i=0;i<n;i++) {
	   System.out.println("Enter the array element");
	   arr[i] = sc.nextInt();
   }
   
   Arrays.sort(arr);
   
   int low,high;
   low = 0; high = n-1;
   boolean flag = false;
   while(low<high) {
	 if( (arr[low] + arr[high]) < x ) {
		low++;
	 }
	 else if( (arr[low] + arr[high]) > x) {
		 high--;
	 }
	 else if((arr[low] + arr[high]) == x) {
		 System.out.println("Such a pair exists");
		 flag = true;
		 break;
	 }
   }
   
   if(flag == false) {
	 System.out.println("No such pair exists");  
   }
   
  }

}