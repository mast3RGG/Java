package morgocialincoding;


class ThreadB extends Thread{
	int total = 0;
	@Override
	public void run(){
		System.out.println("I am in run method");
		synchronized(this) {
		for(int i = 0 ; i < 100 ; i++)
	{
		total += i;
		
	}
		this.notify();
		}
		
	}
}

public class WaitAndNotify {
	public static void main(String[] args) throws InterruptedException {
		ThreadB tb = new ThreadB();
		tb.start();
		
		synchronized(tb)
		{
			System.out.println("Main waiting");
			tb.wait();
			System.out.println(tb.total);
			
		}
	}
}
