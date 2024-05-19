import java.util.Arrays;

public class OccuranceNumber {
    static int findOccurance(int [] ar , int x)
    {
        int count = 0;
        if (ar.length == 0)
            return 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == x )
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int [] ar = {1 , 2, 3, 4, 3 , 5};
        int x = 3;
        System.out.println(findOccurance(ar ,x));
    }
}
