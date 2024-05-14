class Sort {
    void bublicSort(int[] ar) {
        for (int i = 0; i < ar.length; ++i) {
            for (int j = 1; j < ar.length - i; j++) {
                if (ar[j] > ar[j - 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                }
            }
        }
    }
}

public class Class {
    public static void main(String[] args)
    {
        int ar[] = {9,2,4,5,1,6,7,10};
        Sort arr = new Sort();
        arr.bublicSort(ar);
        for(int elem: ar)
            System.out.print(elem + " ");
    }
}
