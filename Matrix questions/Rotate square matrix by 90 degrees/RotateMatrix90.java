//Rotation of a square matrix by 90Degrees

public class RotateMatrix90 {
	public static void main(String args[]) {
		int mat[][] = { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        }; 
		int n = mat.length;
		mat = getRotatedMatrix(mat);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static int[][] getRotatedMatrix(int[][] a) {
		int n = a.length;
		int[] t1 = new int[n];
		int k=0;
		
		while(k<n/2){
			for(int i=k; i<n-k-1; i++) {
				t1[i] = a[k][i];
				a[k][i] = a[i][n-1-k];
				a[i][n-1-k] = a[n-1-k][i];
				a[n-1-k][n-1-i] = a[n-1-i][k];
				a[n-1-i][k] = t1[i];
			}
			k++;
		}
		return a;
	}
}