package morgocialin;

import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer2 implements Consumer<String>
{
	@Override 
	public void accept(String name)
	{
		System.out.println(name);
	}
}
public class MyConsumer {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Alin");
		al.add("Maxim"); 
		al.add("Adrian");
		al.add("Octavian");
		
		MyConsumer2 mc2 = new MyConsumer2();
//		Consumer mc3 = new Consumer();
		al.forEach(mc2);
		
		al.forEach(name -> System.out.println(name));
		al.forEach(System.out::print);
		}
}
