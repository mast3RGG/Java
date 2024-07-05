package morgocialin;

public class OrderAgnosticBS {
	public static void main(String[] args) {
		int [] ar = {100 ,90 ,80, 50, 33,22,11,10,9,8,7};
		int target = 100;
		System.out.println(orderAgnositSearchin(ar, target));
	}
	
	public static int orderAgnositSearchin(int[] ar , int target)
	{
		int start = 0;
		int end = ar.length -1;
		
		boolean isAsc = ar[start]  < ar[end-1];
		
		while(start <= end) {
			int mid = start + (end - start) /2 ;
			
			if(target == ar[mid]) {
				return mid;
			}
			
			if(isAsc) {
				if(target > ar[mid])
				{
					start = mid + 1;
				}
				else
				{
					end = mid - 1;
				}
			}
			else
			{
				if(target > ar[mid])
				{
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
