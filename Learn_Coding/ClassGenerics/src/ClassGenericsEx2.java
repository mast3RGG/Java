import java.util.ArrayList;

public class ClassGenericsEx2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Alin");
		al.add("Octavian");
		m1(al);
		System.out.println(al);
	}

	private static void m1(ArrayList al) {
		al.add(1);
		al.add(true);
		al.add(1.231);
		al.add(1);
	}
	
}
