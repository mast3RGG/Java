import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Ex3 ex = new Ex3();
		ex.div();
	
	}
	
	private void div() {
		Scanner scan = new Scanner(System.in);
		try {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int res = a /b;
		System.out.println(res);
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			
		}
		}
}
