public class SelectionSort {
    void selectionSort(int [] ar)
    {
        for(int i = 0 ; i < ar.length -1; ++i)
        {
            int min = i;
        for(int j = i + 1 ; j < ar.length;j++)
        {
            if(ar[j] < ar[min])
                min = j;
        }
        int temp = ar[min];
        ar[min] = ar[i];
        ar[i] = temp;
    }
    }
}
