package morgocialin;


class MyThread6 extends Thread{
	@Override 
	public void run()
	{
		Thread.yield();
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(i);
		}
	}
}

public class MethodJoin {
	public static void main(String[] args) throws InterruptedException {
		MyThread6 mt5 = new MyThread6();
		mt5.start();
		mt5.join();
		for(int i = 10 ; i < 20 ; i++)
		{
			System.out.println(i);
		}
		
	}
}
