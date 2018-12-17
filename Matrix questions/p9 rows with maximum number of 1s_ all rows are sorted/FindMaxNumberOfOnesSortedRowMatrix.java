//Find rows with maximum number of ones. All rows are sorted
//Dheeraj Doodhya. 
//Approach 1 :Traverse all rows element by element and check which row has max number of 1s. Complexity = n*n*n

public class FindMaxNumberOfOnesSortedRowMatrix {
	public static void main(String args[]) {
		int[][] a = {{0,0,1,1},{0,0,0,1},{1,1,1,1}};
		int max1s = getMax1s(a);
		System.out.println("Row with max number of 1s is : "+max1s);
	}

	public static int getMax1s(int[][] a) {
		int n = a.length;		//number of rows
		int m = a[0].length;	//number of columns
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
		
		}
		return max;
	}
}