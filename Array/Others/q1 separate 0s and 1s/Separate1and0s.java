public class Separate1and0s{
  public static void main(String args[]) {
    int[] arr = {0,1,1,1,0,0,1,0,0,1,1};
	int n = arr.length;
	
	separateValues(arr, n);
	System.out.println("Separated values in array : ");
	for(int i=0; i<n; i++) System.out.print("\t"+arr[i]);
  }
  
  public static void separateValues(int[] arr, int n) {
	  int low = 0, high = n-1,temp;
	  while(low<high) {
		  while((arr[low] == 0)&& low<high ) low++;
		  while((arr[high] == 1)&& low<high) high--;
		  if((arr[low] == 1)&&(arr[high] == 0)){
			  temp = arr[low];
			  arr[low] = arr[high];
			  arr[high] = temp;
			  low++; high--;
		  }
	  }
  }
}