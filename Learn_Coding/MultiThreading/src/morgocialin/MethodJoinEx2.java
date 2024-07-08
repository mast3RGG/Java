package morgocialin;


class MyThread7 extends Thread{
	public static Thread trr;
	
	@Override
	public void run()
	{
		try {
		trr.join();	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(i);
		}
	}
}
public class MethodJoinEx2 {
	public static void main(String[] args) throws InterruptedException{
		MyThread7.trr = Thread.currentThread();
		MyThread7 mt7 = new MyThread7();
		mt7.start();
		
		testMethod();
		
	}
	
	public static void testMethod() throws InterruptedException
	{
		for(int i = 10 ; i < 20 ; i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}
}
