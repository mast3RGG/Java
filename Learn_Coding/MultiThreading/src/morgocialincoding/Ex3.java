package morgocialincoding;
class ThreadEx3 extends Thread
{
	@Override
	public void run() {
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName() + " ");
//			System.out.print(i);
		}
	}
}
public class Ex3 {
	public static void main(String[] args) {
		ThreadEx3 t1 = new ThreadEx3();
		ThreadEx3 t2 = new ThreadEx3();
		t1.start();
		t2.start();
		for(int i = 10 ; i<20 ;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " ");
//			System.out.print(i);
		}
	}

}
