class A {
    void dispA (){

    }

    class B {
        void dispB(){

        }
    }
}


public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.dispA();

        A.B obj2 = obj.new B();
        obj2.dispB();
    }
}