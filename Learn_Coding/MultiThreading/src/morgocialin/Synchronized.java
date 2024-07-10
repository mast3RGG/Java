package morgocialin;

class Display2{
	public static synchronized void sysout1()
	{
		try {
		for(char i = 'a' ; i < 'z' ; i++)
		{
			System.out.println(i);
			Thread.sleep(500);
		}}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public  void sysout2()
	{
		try {
		for(int i = 0 ; i < 27 ; i++)
		{
			System.out.println(i);
			Thread.sleep(500);
		}}catch(InterruptedException e)
		{
			e.getMessage();
		}
	}
}
class Thread11 extends Thread {
	Display2 display;
	
	public Thread11(Display2 display) {
		this.display = display;
	}
	
	@Override 
	public void run()
	{
		display.sysout1();
	}
}
class Thread12 extends Thread
{
	Display2 display;
	
	public Thread12(Display2 display) {
		this.display =display;
	}
	
	@Override
	public void run() {
		display.sysout2();
	}
}
public class Synchronized {
	public static void main(String [] args)
	{
	Display2 d2 = new Display2();
	Thread11 th1 = new Thread11(d2);
	Thread12 th2 = new Thread12(d2);
	th1.start();
	th2.start();
	}
}
