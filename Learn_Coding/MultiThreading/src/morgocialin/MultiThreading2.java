package morgocialin;


class MyThread2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Octavian e cel mai tare");
		Thread.currentThread().setName("Octavian Thread");
		System.out.println(Thread.currentThread().getName());
		try {
		int result = 10/0;
		}catch(ArithmeticException e)
		{
			System.out.println("cant / 0");
		}
		}
}
public class MultiThreading2 {
	public static void main(String[] args) {
		System.out.println("Main thread");
		
		MyThread2 mt = new MyThread2();
		Thread t1 = new Thread(mt);
		t1.start();
		
		
		Thread.currentThread().setName("mainOctavian");
		System.out.println(Thread.currentThread().getName());
		
		
		int []ar =new int[5];
		ar[6] = 10;
	}
}
