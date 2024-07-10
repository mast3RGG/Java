package morgocialin;


class MyThread9 extends Thread{
	@Override
	
	public void run()
	{
		try {
			for(int i = 0 ; i < 10 ; i++)
			{
				System.out.println(i);
				Thread.sleep(10);
			}
		} catch (InterruptedException  e) {
			System.out.println("Interrupted");
		}
	}
}
public class InterruptCases {
	public static void main(String[] args) {
		MyThread9 mt9 = new MyThread9();
		mt9.start();
		mt9.interrupt();
		System.out.println("Ending the main thread");
	}
}
