import java.util.Scanner;


public class ClassExpetionPart2Ex1
{
	public static void main(String[] args) throws InterruptedException    {
		  Scanner scan = new Scanner(System.in);
		  int a = scan.nextInt();
		  int b = scan.nextInt();
		  div(a ,b);
		  Thread.sleep(1000);
	}
	
	private static  void div(int a, int b) throws ArithmeticException{
		try {
		int res= a / b;
		System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Nu poti imparti la zero");
		}
		}
}