package learning;

class AA {

}

class BB extends AA{
	
}

public class Instanceof {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		
		System.out.println(a instanceof BB);
		System.out.println(b instanceof AA);
		System.out.println(a instanceof BB);
		
		String s = new String("Alin");
		System.out.println(s instanceof Object);
		System.out.println();
		
	}
}
