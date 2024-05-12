import java.util.*;
public class Class2 {
    public static void main(String[] args)
    {
        //write a program that store and disyplay mark of 5 student
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number of stundent");
        int n = scan.nextInt();
        int [] st = new int[n];

        for(int i = 0 ; i < st.length ; i++)
        {
            System.out.println("Please enter marks of student " + (i+1));
            st[i] = scan.nextInt();
        }
        System.out.println("The mark of student are :");
        for(int i = 0 ; i < st.length ; i++)
        {
            System.out.print(st[i] + " ");
        }
    }
}
