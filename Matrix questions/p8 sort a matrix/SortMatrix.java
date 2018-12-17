//Sort a matrix. create a temp array of size n x m. store all elements of matrix into that. Sort this array and put back in matrix
//Dheeraj Doodhya
import java.util.Arrays;

public class SortMatrix {
	public static void main(String args[]) {
		int[][] a = {{4,9,1}, {2,8,3}, {6,5,7}};
		
		a = sortMatrix(a);
		System.out.println("Sorted matrix is : ");
		printMatrix(a);
	}
	
	public static int[][] sortMatrix(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		int ptr = 0;
		int len = n*m;
		
		int[] t = new int[len];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				t[ptr] = a[i][j];
				ptr++;
			}
		}
		
		Arrays.sort(t);
		
		ptr=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j]= t[ptr];
				ptr++;
			}
		}
		return a;
	}
	
	public static void printMatrix(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print("\t" + a[i][j]);
			}
			System.out.println("");
		}
	}
}
