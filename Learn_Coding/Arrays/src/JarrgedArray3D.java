import java.util.*;
public class JarrgedArray3D {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

       int[][][] ar = new int[2][][];
       ar[0] = new int[2][];
       ar[1] = new int[1][];
       ar[0][0] = new int[3];
       ar[0][1] = new int[2];
       ar[1][0] = new int[4];

       for(int i = 0 ; i< ar.length ; i++){
           for(int j = 0 ; j < ar[i].length ; ++j)
           {
               for(int k = 0 ; k < ar[i][j].length ; ++k){
                   System.out.println("College " +i + "Clasa " + j + "Student " + k);
                    ar[i][j][k] = scan.nextInt();
               }
           }
       }
        for(int i = 0 ; i< ar.length ; i++){
            for(int j = 0 ; j < ar[i].length ; ++j)
            {
                for(int k = 0 ; k < ar[i][j].length ; ++k){

                    System.out.print(ar[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
