package morgocialin;

class MyThread3 extends Thread{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		int [] ar = {1,2,3,4,5,6,7};
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}
}
public class Priorities {
	public static void main(String[] args) {
		System.out.println("We are in main");
		MyThread3 mt3 = new MyThread3();
		System.out.println(mt3.getName());
		mt3.start();
		int [] arr = {-1,-2,-3,-4,-5,-6,-7};
		for (int i = 0; i < arr.length; i++) {
			System.err.println(arr[i]);
		}
		
	}
}
