package morgocialin;

public class SquareRoot {
	public static void main(String[] args) {
		int x = 8;
		int result = squareRoot(x);
		System.out.println(result);
	}

	private static int squareRoot(int x) {
		for(int i= 0 ; i <= x ; i++)
		{
			int res = i * i;
			if(res == x)
			{
				return i;
			}
			else if(res > x)
			{
				return i -1;
			}
			
		}
		return -1;
	
	}
	
	public static int mySqrt(int x)
	{
		int start = 0;
		int end = x;
		int ans = 0;
		
		if(x == 0 || x == 1)
		{
			return x;
		}
		 
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			int sqrt = mid * mid;
			
			if(sqrt == x)
			{
				return mid;
			}
			else if (sqrt < x)
			{
				start = mid +1;
				ans = mid;
			}
			else {
				end = mid -1;
			}
		}
		return ans;
	}
}
