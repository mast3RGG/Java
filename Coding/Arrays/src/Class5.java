public class Class5 {
    public static void main(String [] args){
        int [] a =  {1 , 2 ,3 ,4, 5};
        char[] c  = {'a' , 'c' ,'b' ,'a'};
        int [][] ar = {{14,15} , {24 , 25}};
        for(int i = 0 ; i < a.length ; ++i)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < c.length ; ++i)
        {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i<ar.length ; i++)
        {
            for(int j = 0 ; j < ar[i].length ; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int array : a)
            System.out.println(array);
    }
}
