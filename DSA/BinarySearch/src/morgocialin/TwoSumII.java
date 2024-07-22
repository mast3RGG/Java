package morgocialin;

import java.util.Arrays;

public class TwoSumII {
	public static void main(String[] args) {
		int [] arr = {2,7,11,15};
		int target = 9;
		int [] result = new int[2];
		result = twoSum(arr , target);
		System.out.println(Arrays.toString(result));
	}


	public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                result[0] = left + 1; 
                result[1] = right + 1; 
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}	
