class C {
    void disp()
    {
        System.out.println("Class C");
    }

    static class D {
        void disp()
        {
            System.out.println("Class D");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.disp();

        C.D obj2 = new C.D();
        obj2.disp();
    }
}
