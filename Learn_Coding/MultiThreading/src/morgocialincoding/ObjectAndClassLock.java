package morgocialincoding;

class Display2{
	void disp(String name)
	{
		synchronized(Display2.class)
		{
			System.out.println("The current thread that is exectuting is : " + Thread.currentThread().getName());
			for(int i = 0 ; i < 3 ; i++)
			{
				System.out.print("Hello : " );
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
	}
}

class ThreadEx extends Thread{
	Display2 d ;
	String name;
	public ThreadEx(Display2 d , String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override 
	public void run()
	{
		d.disp(name);
	}
	
}
class ObjectAndClassLock {

	public static void main(String[] args) {
		Display2 d = new Display2();
		Display2 d2 = new Display2();
		ThreadEx t1 = new ThreadEx(d , "Alin");
		ThreadEx t2 = new ThreadEx(d2 , "Octavian");
		t1.setName("AlinThread");
		t2.setName("OctavianThread");
		
		t1.start();
		t2.start();

	}
}