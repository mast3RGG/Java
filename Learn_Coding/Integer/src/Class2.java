public class Class2 {
    public static void main(String[] args) {
        float a =  10f;
        int b = (int) a;
        System.out.println(b);
        add(1 ,2 ,3,4);
        add(2, 10);
        int [] ar = {1, 2 ,3,4};
        int []ar1 = {10 ,1 ,2,3,4};
        add(ar , ar1);
    }

    public static void add(int ...x)
    {
        int sum = 0 ;
        for(int elem : x)
        {
            sum+=elem;
        }
        System.out.println(sum);
    }
    public static void add(int[] ... x)
    {
        for(int [] a : x)
        {
            for(int elem : a)
            {
                System.out.print(elem + " " );
            }
            System.out.println();
        }
    }
}
