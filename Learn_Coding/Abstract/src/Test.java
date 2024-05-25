class SomeClass{
    int  a;
    static int b=1;
    SomeClass(){a= 2;}

    public void method1()
    {
        System.out.println(a+b);
    }

    public static void methode2()
    {
        System.out.println(a-b);
    }
    public static void method3()
    {
        System.out.println(2*b);
    }
    public void method4()
    {
        System.out.println(a/2);
    }

}

public class Test {
    public static void main(String[] args) {
        SomeClass alin = new SomeClass();
        SomeClass.methode1();
        SomeClass.methode2();
        SomeClass.methode3();
        SomeClass.methode4();
    }
}