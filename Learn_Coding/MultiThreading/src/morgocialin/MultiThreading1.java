package morgocialin;


class MyThread extends Thread{
	public static Thread tr;

	@Override
	//task for child thread
	public void run()
	{
		for (int i = 0; i < 3; i++) {
			System.out.println("Child Thread");
		}
		
	}
	
	public void run(int x)
	{
		System.out.println("Args run " + x);
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("My runnable inteface");
		}
	}
	
	public void disp()
	{
		System.out.print("Hello");
	}
}

public class MultiThreading1{
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		MyThread t = new MyThread();
		t.start();
		
		
		MyRunnable mr = new MyRunnable();
		Thread d = new Thread(mr);
		d.start();
		
		//task for main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}