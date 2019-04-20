//Multithreading demo using Thread class 

class MyThread extends Thread {
	public void run() {
		try {
			//printing current thread id
			System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
		}
		catch(Exception e) {
		
		}
	}
}

public class ThreadingDemo {
	public static void main(String args[]) {
		int n = 5;	//creating 5 threads
		for(int i=0; i<5; i++) {
			MyThread t = new MyThread();
			t.start();
		}
	}
}