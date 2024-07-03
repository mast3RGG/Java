class Parent {
    void disp()
    {
        System.out.println("Forta disp parent");
    }
    void masina ()
    {
        System.out.println("masina");
    }
}

class Child extends Parent{
    void disp()
    {
        System.out.println("Forta disp child");
    }

    void alin(){
        System.out.println("alin");
    }
}
public class Class5 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.masina();
        p1.disp();

        Child c1 = new Child();
        c1.disp();
        c1.disp();

        Parent c2 = new Child();
        c2.disp();
        c2.masina();
        ((Child)c2).alin();
    }
}