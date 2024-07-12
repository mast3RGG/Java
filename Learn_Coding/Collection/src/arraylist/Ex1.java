package arraylist;
import java.util.ArrayList;
import java.util.Arrays;


public class Ex1 {
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);

		System.out.print(l1);
		
		ArrayList l2 = new ArrayList();
		
		l2.add("Alin");
		l2.add("Morgoci");
		l2.add(17);
		l2.add('m');
		
		System.out.println(l2);
		
		System.out.println("*".repeat(20));
		ArrayList l3 = new ArrayList();
		l3.addAll(l2);
		System.out.println(l3);
	}
}
