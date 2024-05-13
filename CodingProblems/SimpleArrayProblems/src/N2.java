public class N2 {
    public static void main(String [] args)
    {
        int [][] ar = new int [10][10];

        for(int i = 0 ; i < ar.length ; ++i)
        {
            for(int j= 0 ; j < ar[i].length;++j)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
