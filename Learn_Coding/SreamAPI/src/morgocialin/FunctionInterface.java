package morgocialin;

import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		Function <String , Integer> alin = i -> i.length(); 
		int i = alin.apply("BontarciucOctavian");
		System.out.println(i	);
	}
}
