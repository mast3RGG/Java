package learning;

public class Class5 {
	public static void main(String[] args) {
		Class5 class1 = new Class5();
		try {
		int [] ar = new int[1231231230];
		}
		catch(OutOfMemoryError e ) {
			System.out.println("Alin ebos ");
		}
		
		try {
			class1.disp();
			
		}
		catch(StackOverflowError e)
		{
			System.out.println(e.getMessage());
			System.out.println("Alin nu mai e tare");
		}
		}
	
	private void disp() {
		// TODO Auto-generated method stub
		disp();
	}
}
