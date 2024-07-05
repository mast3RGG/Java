package morgocialin;

public class BinarySearchTraining {
	public static void main(String[] args) {
		int [] arr = {1 , 2 ,3 ,3,4 ,5, 6, 7, 8};
		int target = 5;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int resutl = linearSearch(arr , target);
		int result = binarySearchTraining(arr , target);
		System.out.println(resutl);
		
	}

	private static int binarySearchTraining(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
		}
		
		return -1;
	}

	private static int linearSearch(int[] arr, int target) {
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] == target)
			{
				return arr[i];
			}
		}
		return -1;
	}
	
}
