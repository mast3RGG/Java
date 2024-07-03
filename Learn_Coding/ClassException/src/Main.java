import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("1 number");
        int num1 = scan.nextInt();
        System.out.println("2 number");
        int num2 = scan.nextInt();

            int res = num1 / num2;
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("error");
        }

    }
}