import java.sql.SQLOutput;
import java.util.Scanner;

class Car1{
    int year;
    int noOfWheels;
    String name;
}
public class Class7 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Car1 [] ar = new Car1[5];
        for(int i = 0 ; i<ar.length; ++i){
            ar[i] = new Car1();
            System.out.println("Year :");
            ar[i].year = scan.nextInt();
            System.out.println("nOfWheels :");
            ar[i].noOfWheels = scan.nextInt();
            System.out.println("Name : ");
            ar[i].name = scan.next();
        }

        for(int i = 0 ; i < ar.length ; ++i){
            System.out.println("Year : " + ar[i].year);
            System.out.println("Wheels : " + ar[i].noOfWheels);
            System.out.println("Name : " + ar[i].name);
        }

    }
}
