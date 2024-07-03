import com.sun.source.tree.CompoundAssignmentTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exampl3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Nr1");
        int nr1 = scan.nextInt();
        System.out.println("Nr2");
        int nr2 = scan.nextInt();
        Integer res = nr1/ nr2;
        System.out.println(res);
    }
        catch (ArithmeticException e)
        {
            System.out.println("Impartire la zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Introdu numere valide doar cifre");
        }
        catch (Exception e)
        {
            System.out.println("Input mismatch");
        }
        try {

            System.out.println("Itrodu dimensiunea ararayouo");
            int size = scan.nextInt();
            int [] ar = new int[size];
            System.out.println("Introdu elemenutul pe care vrei sa l introduci");
            int elem = scan.nextInt();
            System.out.println("Introdu pozitia");
            int poz = scan.nextInt();
            ar[poz] = elem;
            System.out.println("Element adaugat cu succes");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Dimensiunea arraylui nu corespudne");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Dimensiunea arraylui nu poate fi negativa");
        }
        catch(Exception e)
        {
            System.out.println("Input mismatch");
        }
}}
