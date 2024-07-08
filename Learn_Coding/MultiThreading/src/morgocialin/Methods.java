package morgocialin;

class MyThread4 extends Thread{
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

public class Methods {
	public static void main(String[] args) {
		MyThread4 mt4 = new MyThread4();
		mt4.start();
		
		for(int i = 10 ; i < 20 ; i++)
		{
			System.out.println(i);
		}
	}
}
