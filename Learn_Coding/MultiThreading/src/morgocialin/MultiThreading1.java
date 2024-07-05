package morgocialin;

class MyThread extends Thread{
	@Override
	//task for child thread
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("My thread");
		}
	}
}

public class MultiThreading1{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		//task for main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
}