//inplace program for square matrix rotation by 90 degress

public class RotateMatrixInplace90 {
	public static void main(String args[]) {
		
		int[][] a = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		a = getRotated(a);
		printMatrix(a);
	}
	
	public static int[][] getRotated(int[][] a) {
		int n = a.length;
		int temp;
		
		//First take transpose of matrix
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i < j) {
					temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
		}
		
		printMatrix(a);
		System.out.println("Above is the Matrix after transpose : ----------");
		
		//Reverse each column	
		
		for(int j=0; j<n; j++) {
			for(int i=0; i<=n/2; i++) {
				temp = a[i][j];
				a[i][j] = a[n-i-1][j];
				a[n-i-1][j] = temp;
			}
		}
		return a;
	}
	
	public static void printMatrix(int[][] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}