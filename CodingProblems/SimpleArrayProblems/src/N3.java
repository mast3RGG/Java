public class N3 {
    public static void main(String [] args)
    {
        //Tried with ternary
        int val = 111;
        boolean flag = false;

        int [] ar = {1 , 2, 3, 4, 5, 6, 15, 8, 23, 10};
        for(int elem : ar)
        {
            flag = (val == elem)?true : flag;
        }

        String result = flag?"Present" : "No";
        System.out.println(result);
    }
}
