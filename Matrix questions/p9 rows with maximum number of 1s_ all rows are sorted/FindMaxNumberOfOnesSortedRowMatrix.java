//Find rows with maximum number of ones. All rows are sorted
//Dheeraj Doodhya. 
//Approach 1 :Traverse all rows element by element and check which row has max number of 1s. Complexity = n*n*n

public class FindMaxNumberOfOnesSortedRowMatrix {
	public static void main(String args[]) {
		int[][] a = { { 0, 0, 0, 1 }, 
                        { 0, 1, 1, 1 }, 
                        { 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0 } };
		int max1s = getMax1s(a);
		System.out.println("Row with max number of 1s is : "+max1s);
	}

	public static int getMax1s(int[][] a) {
		int n = a.length;		//number of rows
		int m = a[0].length;	//number of columns
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			int l = getFirstindex1(a[i], 0 , m-1);
			if(l== -999)
				continue;
			int diff = m-l;
			if(max < diff)
				max = diff;
		}
		return max;
	}
	
	public static int getFirstindex1(int[] a, int l, int h) {
		int mid;
		if(l<=h) {
			mid = (l+h)/2;
			if((mid==0 || a[mid-1] == 0) && a[mid]==1)
				return mid;	
			else if(a[mid]==0)
				return getFirstindex1(a, mid+1, h);
			else
				return getFirstindex1(a, l, mid-1);
		}
		return -999;
	}
}