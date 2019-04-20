class ChildThread extends Thread {
	public void run() {
		System.out.println("Hello from child thread");
	}
}

//this class extends thread because using this class we can have control over "main" thread
public class Demo extends Thread {
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Name of thread is : "+t.getName());
		t.setName("MyThread");
		System.out.println("New Name of thread is : "+t.getName());
		
		System.out.println("Thread priority is : "+t.getPriority());
		t.setPriority(8);
		System.out.println("New Thread priority is : "+t.getPriority());
		
		ChildThread ct = new ChildThread();    // this thread is created by main so this is child thread of main
		System.out.println("ChildThread priority is : "+t.getPriority());		//inherits priority from parent
		ct.start();		
		
	}

}