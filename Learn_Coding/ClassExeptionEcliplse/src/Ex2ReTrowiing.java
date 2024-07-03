
public class Ex2ReTrowiing {
	public static void main(String[] args) {
		try {
		Ex2ReTrowiing er = new Ex2ReTrowiing();
		er.div();
		System.out.println("Suntem in main");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Suntem in main , dar in catch block");
		}
	}
	
	private void div() throws ArithmeticException{
		try {
		int a = 10;
		int b = 0;
		int div = a/ b;
	}catch(ArithmeticException e)
		{
		System.out.println("Impartirea la zero este imposibila , dar suntem in div ");
		throw e;
		}
		finally {System.out.println("Dupa throew");
		}		
	}
}
