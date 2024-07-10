package morgocialincoding;

class Display {
	public void wish(String name)
	{
		synchronized(Display.class)
		{
		System.out.println("Thread which got a chance is : " + Thread.currentThread().getName());
		for(int i = 0 ; i <= 5 ; i++)
		{
			System.out.print("Hello :");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println(name);
		}}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	
	public MyThread(Display d , String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run()
	{
		d.wish(name);
	}
}
public class MultiThreading1 {
	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();
		
		MyThread mt1 = new MyThread(d , "Morgoci Alin");
		MyThread mt2 = new MyThread(d2 , "Morgoci Maxim");
		mt1.setName("Morgoci Alin");
		mt2.setName("Morgoci Maxim");
		mt1.start();
		mt2.start();
	}

}
