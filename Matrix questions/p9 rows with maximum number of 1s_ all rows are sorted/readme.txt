Adding to this : 

//approach third :  here we will find first occurrence of 1 in first row of matrix and will move down the matrix, check for leftmost 1.If leftmost one lies on left side of existing pinter, change pointer, else ignore
//Dheeraj Doodhya

public class FindMaxNumberOfOnesSortedRowMatrix2 {
	public static void main(String args[]) {
		int[][] a = { { 0, 0, 0, 1 }, 
                        { 0, 1, 1, 1 }, 
                        { 0, 0, 1, 1 }, 
                        { 0, 0, 0, 0 } };
						
		int max1 = getRowMax1(a);
		System.out.println("max number of 1 in any row is :" +max1);
	}
	
	public static int getRowMax1(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		
		int ptr=m-1;
		
		for(int i=0; i<n; i++) {
			while(a[i][ptr] == 1){ 
				ptr--;
			
			if(ptr == -1)
				return m;
			}
		}
		return m-1-ptr;
	}
}