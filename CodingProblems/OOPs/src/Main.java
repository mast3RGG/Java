class Person
{
    String name ;
    int age;


    public Person (String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    void disp()
    {
        System.out.println("Nume " + name + " " + "age " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alin" , 10);
        Person p2 = new Person("Morgoci" , 20);

        p1.disp();
        p2.disp();
    }
}