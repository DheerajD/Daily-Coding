import java.util.Scanner;
import java.util.HashMap;

public class CheckPair2 {

  public static void main(String args[]) {
    int n,x,range=100;			//let range of numbers be 1-100
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of x");
	x = sc.nextInt();
	System.out.println("Enter the number of elements in the array");
	n = sc.nextInt();
	
	HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
	for(int i=0;i<=range;i++) {
		hm.put(i,false);				//initialising values to false
	}
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter the element (value smaller than 100)");
		hm.put(sc.nextInt(),true);					//put() would overwrite the existing values
	}
	
	for(int i=0;i<=range;i++) {
		if(hm.get(i)){
			if(x-i>0){
			  if(hm.get(x-i)){
				  count++;
			  }
			}
		}
	}
	
	if(count==0) 
		System.out.println("No such pair exists");
	else 
		System.out.println((count/2)+" such pair exists");		//each pair counted twice
  }
}