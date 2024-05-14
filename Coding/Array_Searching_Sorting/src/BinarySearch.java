import java.util.Scanner;

class BinarySearch{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int [] ar = {1 , 2, 3, 4, 5, 6, 7, 8, 9,10,11};
        int low = 0 , high = ar.length;
        int key = scan.nextInt();
        while(low <= high)
        {
           int mid = (low +high) /2 ;
           if(key == ar[mid]){
               System.out.println("Index " + mid);
               break;
           }
           else if (key > mid)
               low = mid + 1;
           else if(key < mid);
           high = mid -1;
        }
        if(low>high)
            System.out.println("Not found");
    }
}