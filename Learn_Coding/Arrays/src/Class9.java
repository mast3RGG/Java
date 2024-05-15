public class Class9 {
    public static void main(String[] args)
    {
        int max = 0;
        int [] ar = {1 , 2 , 3 ,4 , 5 ,6 ,7 ,8};
        /*for(int elem : ar)
        {
            max = (elem > max)? elem : max;
        }
        System.out.println(max);
*/
        for(int i = 0 ; i < ar.length ; ++i)
        {
            if(ar[i] > max ){
                max = ar[i];
            }
        }
        System.out.println(max);
    }
}
