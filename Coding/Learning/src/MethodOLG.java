class Display
{
    void disp()
    {
        System.out.println("Java");
    }
    void disp(String name)
    {
        System.out.println(name);
    }
    void disp(int age)
    {
        System.out.println(age);
    }
}

public class MethodOLG {
    public static void main(String[] args)
    {
        Display d = new Display();
        d.disp();
        d.disp("Alin");
        d.disp(17);
    }
}
