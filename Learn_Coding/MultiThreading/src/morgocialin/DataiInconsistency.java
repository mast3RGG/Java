package morgocialin;

class Display{
	public synchronized void display(String name)
	{
		for(int i = 0; i < 5 ; i++)
		{
			try {
			System.out.print("Good Morning " );
			Thread.sleep(1500);
			System.out.print(name);
			Thread.sleep(1500);
			System.out.println();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
	}
	public void display2(String name)
	{
		System.out.println("Hello " + name);
	}
}
class MyThread10 extends Thread{
	String name ;
	Display display;
	
	public MyThread10(String name , Display display) {
		this.name = name;
		this.display = display;
	}
	
	@Override
	public void run()
	{
		display.display(name);
		display.display2(name);
		}
}
public class DataiInconsistency {
	public static void main(String[] args) {
		Display disp = new Display();
		MyThread10 mt10 = new MyThread10("Morgoci Alin" , disp);
		MyThread10 mt11 = new MyThread10("Morgoci Maxim" ,disp);
		mt10.start();
		mt11.start();
	}
}
