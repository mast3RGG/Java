package morgocialin;


class Ex{
	private String name ;
	public Ex(String name) {
		this.name = name;
		System.out.println("Constructor is calling " + name);
	}
}
@FunctionalInterface
interface InterfaceOne
{
	 Ex m1(String a);
}
public class MethodConstrucotrBinding {
	public static void main(String[] args) {
		InterfaceOne i1 = Ex :: new;
		i1.m1("Binding");
	}
}
