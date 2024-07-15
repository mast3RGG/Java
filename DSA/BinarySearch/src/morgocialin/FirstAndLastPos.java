package morgocialin;

import java.util.Arrays;

public class FirstAndLastPos {
	public static void main(String[] args) {
		int [] ar = {3 , 7 ,7 ,7 ,7 ,8,8,10};
		int [] res = new int[2];
		int target = 7;
		res = firstAndLastPos(ar , target);
		int[] ans = firstAndLastPosBS(ar, target);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] firstAndLastPos(int[] ar , int target) {
		int [] res = new int[2];
		
		for(int i = 0 ; i< ar.length; i++){
			if(ar[i] == target)
			{
				res[0] = i;
				break;
			}
		}
		if(res == null)
			return null;
		else {
		
		for(int i = ar.length -1 ; i>= 0 ; i--)
		{
			if(ar[i] == target)
			{
				res[1] = i;
				break;
			}
		}}
		return res ;
	}
	private static  int [] firstAndLastPosBS(int [] ar , int target)
	{
		int [] res = {-1 , -1};
		int start = search(ar , target , true);
		int end = search(ar , target ,false);
		res[0] = start;
		res[1] = end;
		return res;
				}
	private static int search(int [] ar , int target , boolean leftOrRight)
	{
		int start = 0;
		int end = ar.length - 1;
		int ans = -1;
		while(start <= end)
		{
			int mid = start + (end - start ) /2;
			if(target < ar[mid])
			{
				end = mid -1;
			}
			else if (target > ar[mid]) {
				start = mid+1;
			}
			else {
				ans = mid;
				if(leftOrRight)
				{
					end = mid -1;
				}
				else {
					start = mid +1;
				}
			}
			
		}
		return ans;
	}
}
