package morgocialin;

import java.util.function.Predicate;



public class PredicateI  {
	public static void main(String[] args) {
		int [] arr = {1, 2,3,22,33,44,55,66,77};
		Predicate<Integer> p = i -> i>10;
		methodOne(arr , p);
		Predicate<Integer> p2 = i -> i%2 == 0;
		System.out.println("That are greter and even");
		methodOne(arr, p2.and(p));
		System.out.println("That are great but not even");
		methodOne(arr, p.and(p2).negate());
	}

	private static void methodOne(int[] arr, Predicate<Integer> p) {
		for (int i : arr) {
			if(p.test(i))
				System.out.println(i);
		}
	}
}
