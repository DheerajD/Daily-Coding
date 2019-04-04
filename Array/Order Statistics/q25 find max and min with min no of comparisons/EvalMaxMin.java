class MaxMin {
	int max;
	int min;
	
	public MaxMin() {
	  max = Integer.MIN_VALUE;
	  min = Integer.MAX_VALUE;
	}
}

public class EvalMaxMin {
  public static void main(String args[]) {
    int[] arr = {100,34,2,78,65,109,69};
	int n = arr.length;
	MaxMin x;
	x = getMaxMin(arr, 0, n-1);
	System.out.println("Max of array is "+x.max+", min of array is "+x.min);
  }

  public static MaxMin getMaxMin(int[] arr, int low, int high) {
	  MaxMin m = new MaxMin();
	  int mid = (low+high)/2;
	  
	  if(low == high){
		  m.max = arr[0];
		  m.min = arr[0];
		  return m;
	  }
	  else if(high == (low+1)) {
		  if(arr[low]>arr[high]) {
			  m.max = arr[low];
			  m.min = arr[high];
			  return m;
		  }
		  else {
			  m.max = arr[high];
			  m.min = arr[low];
			  return m;
		  }
	  }
	  else {
		  MaxMin mm1 = getMaxMin(arr,low,mid);
		  MaxMin mm2 = getMaxMin(arr,(mid+1),high);
		  
		  if(mm1.max > mm2.max) m.max = mm1.max;
		  else m.max = mm2.max;
			  
		  if(mm1.min < mm2.min) m.min = mm1.min;
		  else m.min = mm2.min;
		  
		  return m;
	  }
  }
  
  
}
