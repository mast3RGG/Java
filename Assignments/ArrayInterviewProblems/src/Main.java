//Find a peak element which is not smaller than its neighbours
//Last Updated : 20 Nov, 2023
//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
//
//        Note: If the array is increasing then just print the last element will be the maximum value

class PeakElement{

    static int peakElement(int arr[] , int n)
    {
        if(n == 1 )
            return 0;
        else if (arr[0] > arr[1])
            return 0;
        else if (arr[n-1] > arr[n-2])
            return n-1;
        else
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                    return i;
            }
        }
        return 0;
    }

    static int peakElementBinary(int arr[] , int n)
    {
        int first=0;
        int last = n - 1;
        int mid = 0;

        while(first < last){
            mid = (last + first) >> 1;

            if ((mid == 0
                    || arr[mid - 1] <= arr[mid])
                    && (mid == n - 1
                    || arr[mid + 1] <= arr[mid]))
            {
                break;
            }
            else if (arr[mid -1] > arr[mid])
            {
                last = mid -1;
            }
            else
                first = mid +1;


        }
        return mid;
    }

    public static void main(String[] args)
    {
        int [] ar = {1 , 2, 3, 4, 5, 19, 7, 8,10};
        int n = ar.length;
        int peak = peakElementBinary(ar , n);
        System.out.println(peak);
    }
}