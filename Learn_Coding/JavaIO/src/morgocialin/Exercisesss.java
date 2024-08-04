package morgocialin;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercisesss {
	public static void main(String[] args) {
		String [] arr = {"o", "t", "thr", "fo", "fi", "ve", "ur", "ee", "wo", "ne"};
		String [] res = methodArr(arr);
		System.out.println(Arrays.toString(res));
	}

	private static  String [] methodArr(String[] arr) {
		String[] finalString = new String[arr.length/2];
		int n = arr.length;
		for(int i = 0 ; i <= n/2 +1; i++)
		{
			finalString[i] = arr[i] + arr[n-1];
			n--;
		}
		return finalString;
	}
}
