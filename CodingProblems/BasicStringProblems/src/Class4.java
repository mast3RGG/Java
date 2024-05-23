class Alin{
    int age;
    String name;
    String city;

    {
        System.out.println("Andrei");
    }
    Alin(){
        this(10);
        System.out.println("Alin");
    }   
    Alin (int alin)
    {
        System.out.println(alin);
    }
}
public class Class4 {
    public static void main(String[] args) {
        Alin al = new Alin();
    }
}
