class DaemonThread extends Thread {
	public DaemonThread(String name) {
		super(name);	//naming a thread
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {			//checking if the thread is daemon thread
			System.out.println("this thread is a daemon thread");
		}
		else {
			System.out.println("this is not daemon, it's a user thread");
		}
		
	}
	
}

public class Demo {
	public static void main(String args[]) {
		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		
		t1.setDaemon(true);	// making thread 1 as daemon thread
		
		t1.start();
		t2.start();
		
		
		DaemonThread t3 = new DaemonThread("t3");
		t3.start();
		t3.setDaemon(true);			//this would give error, we cannot make a thread daemon once it's started.
	}
}