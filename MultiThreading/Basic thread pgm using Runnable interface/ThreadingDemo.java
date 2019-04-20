//Basic thread program using runnable interface

class MyThread implements Runnable {
	public void run() {
		try {
			 System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


public class ThreadingDemo {
	public static void main(String args[]) {
		int n = 5;	//creating 5 new threads
		for(int i=0; i<n; i++) {
			Thread t = new Thread(new MyThread());
			t.start();
		}
	}
	
}