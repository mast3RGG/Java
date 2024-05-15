import java.util.*;


public class JarrgedArray {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] ar = new int[3][];//array declaration
        ar[0] = new int[4];
        ar[1] = new int[3];
        ar[2] = new int[5];
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
