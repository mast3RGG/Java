import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.InvocationHandler;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exmpl2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Nr1");
            int num1 = scan.nextInt();
            System.out.println("Nr2");
            int num2 = scan.nextInt();
            int result = num1/ num2;

            System.out.println("Size of array");
            int size = scan.nextInt();
            int [] arr = new int[size];

            System.out.println("Enter the element to be inserted");
            int elem = scan.nextInt();
            System.out.println("Enter the position");
            int pos = scan.nextInt();
            System.out.println("Element inserted");
        }
        catch (ArithmeticException a){
            System.out.println("Impartirea la zero nu e posibila");
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Nu poti plasa elementul la pozitia data");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Numar negativ la array");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Inputul este gresit");
        }
        catch (Exception e)
        {
            System.out.println("EXCEPTIE");
        }

    }




}