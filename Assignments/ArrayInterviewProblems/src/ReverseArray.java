import java.util.Arrays;

public class ReverseArray {

    static void reverseArray(int[] a , int first , int last)
    {
        while(first<last){
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            ++first;
            --last;
        }
    }
    static void reverse(int a [] , int [] b)
    {
        int index = 0;
        for(int i = a.length-1 ; i >= 0 ; --i) {
            b[index] = a[i];
            ++index;
        }
        for(int i = 0 ; i < b.length ; ++i) {
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String [] args)
    {
        int a[] = {1 , 2, 3,5,6,7,8};
        int last = a.length-1;
        int b[] = new int [a.length];
        reverseArray(a , 0 , last);
        for(int elem : a)
            System.out.print(elem + " ");
    }

}
