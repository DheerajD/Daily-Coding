//To check if all rows are circular rotation of each other. 
//To solve this, I'll create a string out of the first row and then would concatenate it to itself. This string I would use for reference. I'll compare all other row strings with this to check if they are substring of this string or not.
import java.util.Arrays;


public class CheckMatrixRowRotation {
	
	public static void main(String args[]) {
		int[][] a= {{1,2,3}, {2,3,1}, {3,1,2}};
		
		boolean isRotation = checkRotation(a);
		
		System.out.println("is each row rotation of the other : "+isRotation);
	}
	
	public static boolean checkRotation(int[][] a) {
		int n = a.length;			//number of rows
		int m = a[0].length;		//number of columns
		
		String str = Arrays.toString(a[0]);
		str = str.replaceAll("\\[|\\]|,|\\s","");		//replacing [ , ] , <comma ,> and spaces(\s) with nothing, just to get the test. Otherwise it would be of the form [1, 2, 3]
		str = str+str;
		
		for(int i=1; i<n; i++) {
			String str2 = Arrays.toString(a[i]).replaceAll("\\[|\\]|,|\\s", "");
			System.out.println("Hello " + str2);

			if(str.contains(str2))
				continue;
			else return false;
		}
		return true;
	}

}