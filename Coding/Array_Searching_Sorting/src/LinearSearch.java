
import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int [] ar = {1 ,2 ,3,4,5,6,7,8,9,10};
        int key = scan.nextInt();
      l1:  {for(int i = 0 ; i < ar.length ; ++i)
        {
            if (ar[i] == key) {
                System.out.println("Key is on " + i + " index");
                    break l1;
        }
    }
        System.out.println("Not found");}
}
}