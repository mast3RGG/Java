public class Class6 {
    public static void main(String[] args)
    {

         //int [] ar = {1 , 2, 3, 4, 6};
        int [][] ar = {{10,20},{30,40,50},{60,70,80,90}};
        int [][] ar2 = {{20, 30},{40 ,50}};

        for(int artest[] : ar)
        {
            for(int elem : artest)
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
