//Rotate a 2D image by 90 degrees
//Dheeraj Doodhya
//Basically here we are rotating a 2D rectangular array clockwise by 90degrees

public class TurnImage90 {
	public static void main(String args[]) {
		int[][] a = {
					{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}
		};
		System.out.println("Array before rotation is : ");
		printArr(a);
		turnAndPrint(a);
	}
	
	public static void turnAndPrint(int[][] a) {
		int n = a.length;		//no of rows
		int m = a[0].length;		//no of columns
		
		int[][] b = new int[m][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				b[j][n-1-i] = a[i][j];
			}
		}
		
		System.out.println("Array after rotation is : ");
		printArr(b);
	}
	
	public static void printArr(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("");
		}
	}
}