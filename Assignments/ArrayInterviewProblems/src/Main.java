//Find a peak element which is not smaller than its neighbours
//Last Updated : 20 Nov, 2023
//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
//
//        Note: If the array is increasing then just print the last element will be the maximum value

class PeakElement{

    int peakElementNeigbours(int [] a , int n)
    {
        if(a[0] > a[0+1])
            return a[0];
        else if (a[n] > a[n-1])
            return a[n];
        else if (n == 1)
            return  a[0];

        for(int i = 0 ; i < n ; ++i)
            if(a[i] > a[i-1] && a[i] > a[i+1])
                return i;

        return -1;
    }

    public static void main(String[] args)
    {
        int [] ar = {1 , 2, 3, 4, 5, 6, 7, 8,10};
        int n = ar.length;
        PeakElement peak = new PeakElement();
        int element = peak.peakElementNeigbours(ar , n);
        System.out.println("The peak number witchs is not smaller than its neighbours is : " + element);
    }
}