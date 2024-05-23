import javax.crypto.CipherInputStream;

class Parent {
    int age;
    String name;

    Parent()
    {
        System.out.println("Constructor Parent ");
        age = 17;
        name = "Alin";

    }
    Parent(int age , String name)
    {
        this.age = age;
        this.name = name;
    }
}

class Child extends Parent {
    int year;
    String surName;

    Child()
    {
        year = 2006;
        surName = "Morgoci";
    }
    Child(int year , String surName)
    {
        super(17 , "Alin");
        this.year = year;
        this.surName = surName;
    }

    void disp()
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(year);
        System.out.println(surName);
    }
}

public class Class3 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.disp();
        Child ch1 = new Child(2007 , "Morgoci");
        ch1.disp();
    }
}

