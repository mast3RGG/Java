import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ReverseArray {

    static void palindrome(int a)
    {
        String s = String.valueOf(a);
        String s2 = "";
        System.out.println(s);
        for(int i = s.length() -1 ; i >= 0 ; --i){
            s2+= s.charAt(i);
        }
        if(s.equals(s2))
            System.out.println("Palindrom");
        else
            System.out.println("No polindrome");
    }


    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int nr = scan.nextInt();
    palindrome(nr);


}}
