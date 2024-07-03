package learning;

import java.util.Scanner;

public class Class4{
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Alin");
			int res = 10/0;
		}
		catch(ArithmeticException e)
		{
			try {
				System.out.println("Maxim");
			}
			finally {
				System.out.println("Alion");
			}
		}
		finally {
			System.out.println("Adrian");
		}
		
		String a = "Maxim Alin";
		String b = a.toLowerCase();
		
		String [] ar = a.split(" ");
		
		System.out.println(ar[0] + " " + ar[1]);
		
		Scanner scan = new Scanner(System.in);
		int aA = scan.nextInt();
		int bB = scan.nextInt();
		
	}
}