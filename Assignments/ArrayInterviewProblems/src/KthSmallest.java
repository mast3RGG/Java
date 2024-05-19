import java.util.Arrays;

public class KthSmallest {

    static int kthsmallest(int [] ar , int k)
    {
        int [] b = new int[ar.length];
        Arrays.sort(ar);
        return  ar[k-1];

    }


    public static void main(String[] args)
    {
        int k = 2;
        int[] ar ={221 , 23 ,4,1,5,23,4,5,6,11};
        System.out.println(kthsmallest(ar , k));

    }
}
