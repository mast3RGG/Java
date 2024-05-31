abstract class B
{
    abstract void disp();
}

public class AnnonymousClass {
    public static void main(String[] args) {
        B obj = new B()
        {
            @Override
            void disp() {
                System.out.println("Display method");
            }
        };
        obj.disp();
    }

}
