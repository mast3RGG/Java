package learning;

public class InstanceOf2 {
	public static void main(String[] args) throws ClassNotFoundException , InstantiationException{
		Object o = new Thread();
		Thread t = new Thread();
		
		System.out.println(o instanceof Object);
		System.out.println(o instanceof String);
		System.out.println(Class.forName(args[0]).isInstance(o));
		
		
		
	}
}


abstract class AAA {
	abstract protected double getPrice();
}
class BBB extends AAA
{
	protected double getPrice() {
		return 1;
	}}