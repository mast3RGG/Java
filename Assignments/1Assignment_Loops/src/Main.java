import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void  main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;
        int mij = (n - 1) / 2;
        int th = (2*n) / 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > mij || i + j == mij || j - i == mij || j == n - 1 && i > mij || i == mij) {
                    System.out.print("*"); //A
                 } else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) { // L
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 2 || j == 1 && i != 2) {
                    System.out.print("*"); //I
                } else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == n - 1) {
                    System.out.print("*"); // N
                } else
                    System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 0; i < 3; ++i){
            System.out.println();
        }

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; ++j)
            {
                if (j == 0 && i != 2 || j == 1 && i != 2) {
                    System.out.print("*"); //I
                } else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == n - 1) {
                    System.out.print("*"); // N
                } else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0|| i == 0  || i == mij || i == n-1) {
                    System.out.print("*"); // E
                } else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < n-1 || i == n-1 && j != 0 && j != n-1 || j == n-1 && i < n-1) {
                    System.out.print("*"); // U
                } else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || i == 0 && j < th && j != 0 || i == mij && j < th || j == th && i < mij && i != 0
                   || i == j && i > mij) {
                    System.out.print("*"); // R
                } else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j== 0 && i != 0 && i != n-1 || i == 0 && j != 0 && j!=n-1 || j== n-1 && i != 0 && i != n-1
                    || i== n-1 && j != 0 && j != n-1) {
                    System.out.print("*"); // O
                } else
                    System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == n - 1) {
                    System.out.print("*"); // N
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}