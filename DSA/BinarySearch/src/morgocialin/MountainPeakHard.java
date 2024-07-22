package morgocialin;

public class MountainPeakHard {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 10,9,3,2,1 };
		int target = 10;
		int res = searchInMountainArr(ar, target);
		System.out.println(res);
	}

	public static int searchInMountainArr(int[] arr, int target) {
		int peak = peakMountainElement(arr);
		int resAsc = orderAgnosticBS(arr, target, 0, peak);
		if (resAsc != -1) {
			return resAsc;
		}
		return orderAgnosticBS(arr, target, peak + 1, arr.length) ;
	}

	public static int peakMountainElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < arr[mid - 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		boolean isAsc = arr[start] < arr[end -1 ];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
