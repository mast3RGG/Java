 import java.util.Arrays;

class BubbleSort{
    void bubbleSort(int ar[])
    {
        for(int i = 0 ; i < ar.length; ++i)
        {
            for(int j = 1 ; j < ar.length-i ; ++j)
            {
                if(ar[j] > ar[j-1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }
        }
    }
}

public class Main{
    public static void main(String[] args){
        int [] ar = {3,2,6,7,1,2,3,5,9,0,3,123,15,5};
        int [] arr = { 2 , 4,6,1,3,12,5,6,7};
        BubbleSort bsort = new BubbleSort();
        bsort.bubbleSort(ar);
        for(int elem : ar)
            System.out.print(elem + " ");
        SelectionSort selsort = new SelectionSort();
        selsort.selectionSort(arr);
        System.out.println();
        for(int elem : arr)
            System.out.print(elem  + " ");
    }
}