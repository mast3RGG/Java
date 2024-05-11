//Can we overload main method?
//Yes ,we can overload main method ,however JVM will call such a method witch accept
// String[] args as parameters
public class MainMethodOL {
    public static void main(String[] args)
    {
        System.out.println("Java");
    }

    public static void main(int[] args)
    {
        System.out.println("Acepting int arg");
    }

    public static void main(double b)
    {
        System.out.println(b);
    }
}
