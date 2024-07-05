package morgocialin;

public class BinarySearch{
	public static void main(String[] args) {
		int [] ar = {-5 , - 2, 0 ,1,2,3,4,5,6,7,8};
		int target = 3;
		System.out.println(binarySearch(ar , target));
	}
	
	private static int binarySearch(int [] ar , int target) {
		int start = 0 ;
		int end = ar.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start) /2;
			
			if(target < ar[mid])
			{
				end = mid - 1;
			}
			else if (target > ar[mid])
			{
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
}