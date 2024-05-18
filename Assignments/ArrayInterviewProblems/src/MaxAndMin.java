import java.util.Arrays;

public class MaxAndMin {
    static void usingSort(int [] a)
    {
        Arrays.sort(a);
        int max = a[a.length -1 ];
        int min = a[0];
        System.out.println("Max " + max + " Min " + min);
    }

    static int maxElement(int[] a)
    {
        int max = a[0];
        for(int elem : a)
        {
            if(elem > max)
                max = elem;
        }
        return max;
    }

    static int minElement(int [] a)
    {
        int min = a[0];
        for( int elem : a)
        {
            if(elem < min)
                min = elem;
        }
        return min;
    }
    public static void main(String [] args)
    {
        int[] arr = {1 , 2, -2, 4, 100, 6,7,8};
        int max = maxElement(arr);
        int min = minElement(arr);
        System.out.println(max + " " + min);
        
    }
}
