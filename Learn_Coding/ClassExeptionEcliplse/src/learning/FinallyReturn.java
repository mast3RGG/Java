package learning;
public class FinallyReturn {
	public static void main(String[] args) {
		FinallyReturn fr = new FinallyReturn();
		try {
		fr.div();
		}
		catch(ArithmeticException e) {
			System.out.println("Array");
		}
		finally {
			System.out.println("Finally");
		}
		
	}
	
	private void div() {
		int a = 10 , b = 0;
		int res = a /b;
		System.out.println(b);
	}
}
