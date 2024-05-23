class Demo{
    StringBuffer s1 = new StringBuffer("Alin");
    int age = 17;

    void disp()
    {
        System.out.println("Demo " + s1 + " " + age);
    }
}

class Demo11 extends Demo{

}

class Demo22 extends  Demo11{

}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Demo22 demo = new Demo22();
        demo.disp();
    }
}
