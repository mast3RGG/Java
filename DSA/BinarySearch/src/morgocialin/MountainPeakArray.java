package morgocialin;

public class MountainPeakArray {
	public static void main(String[] args) {
		int [] ar = {1  , 2, 4,5,2,1,0};
		int result = peakArrayMountain(ar);
		System.out.println(result);
	}

	private static int peakArrayMountain(int[] ar) {
		int start = 0 ; 
		int end = ar.length-1;
		while(start < end)
		{
			int mid = start + (end - start)/2;
			if(ar[mid] > ar[mid +1])
				{
					end = mid;
				}
			else {
				start = mid +1;
			}
				
		}
		return start;
	}
}
