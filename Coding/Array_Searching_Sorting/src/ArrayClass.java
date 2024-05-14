import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args){
        int [] a =new int[5];
        for(int elem : a)
            System.out.print(elem + " ");
        System.out.println();
        Arrays.fill(a , 5);

        for(int elem : a)
            System.out.print(elem + " ");
        System.out.println();

        int [] ar = {1 , 2, 3 ,0,0,0,0,4};
        Arrays.fill(ar , 3,7,6);

        for(int elem : ar)
            System.out.print(elem + " ");

        System.out.println();

        int arr[]  = {13,14,1,2,3,15,16,17,8,45};
        Arrays.sort(arr);

        for(int elem: arr)
            System.out.print(elem +  " ");

        System.out.println();

        int res = Arrays.binarySearch(arr , 100);
        System.out.println(res);
    }
}
