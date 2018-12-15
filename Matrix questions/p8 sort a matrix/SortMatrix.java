//Sort a matrix. create a temp array of size n x m. store all elements of matrix into that. Sort this array and put back in matrix
//Dheeraj Doodhya

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
	}
}
