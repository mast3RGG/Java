class Sort{
void bubbleSort(int [] ar)
{
    for(int i = 0 ; i < ar.length ; ++i)
    {
        for(int j = 1 ; j < ar.length -i ; ++j)
        {
            if(ar[j] < ar[j-1])
            {
                int tempVar = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = tempVar;
            }
        }
    }
}}
public class BubbleSort {
    public static void main(String[] args)
    {
        Sort arr = new Sort();
        int ar [] = {4 , 2, 3, 2,5,6,1,23};
        arr.bubbleSort(ar);
        for(int elem : ar)
            System.out.print(elem + " ");
        
    }
    
}
