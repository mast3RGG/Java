class Demo1 {
    String name = "Alin";
    int age = 17;

    void display()
    {
        System.out.println("Demo1 " + name + " " + age);
    }
}

class Demo2 extends Demo1{

}

public class Main {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.display();
    }
}