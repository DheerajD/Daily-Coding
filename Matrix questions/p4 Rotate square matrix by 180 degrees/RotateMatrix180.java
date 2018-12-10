//Rotate a given matrix by 180 degrees
//solution 1 : rotate 2 times by 90 degrees
//solution 2 : traverse the matrix in reverse order and store values in new matrix in correct order. Below is the implemntation

public class RotateMatrix180 {

	public static void main(String args[]) {
		int[][] mat = { { 1, 2, 3 }, 
                        { 4, 5, 6 }, 
                        { 7, 8, 9 } };
						
		System.out.println("Matrix before rotation is :");
		printMatrix(mat);
		
		mat = rotate180(mat);
		
		System.out.println("Matrix after rotation is :");
		printMatrix(mat);
	}
	
	public static void printMatrix(int[][] a) {
		int n = a.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static int[][] rotate180(int[][] a) {
		int n = a.length;
		int[][] b = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = a[n-1-i][n-1-j];
			}
		}
		return b;
	}

}