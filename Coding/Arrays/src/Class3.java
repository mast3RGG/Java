import java.util.*;


public class Class3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       int[][] ar = new int[3][4];//array declaration

       for(int i = 0 ; i < ar.length ; ++i)
       {
           for(int j = 0 ; j < ar[i].length ; ++j)
           {
               System.out.println("Class " + i + "Student " + j);
                ar[i][j] = scan.nextInt();
           }
       }

        for(int i = 0 ; i < ar.length ; ++i)
        {
            for(int j = 0 ; j < ar[i].length ; ++j)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
