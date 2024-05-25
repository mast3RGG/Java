class Copil
{
    int age;
    String name;

    public Copil(int age , String name)
    {
        this.age = age;
        this.name = name;
    }
}


class CopilGradi extends Copil
{
    String adresa;
    public CopilGradi(String adresa)
    {
        super(20 , "Artiom");
        this.adresa = adresa;

    }
}

public class Main {
    public static void main(String[] args) {
        CopilGradi c = new CopilGradi("EugeniuCoca");
        System.out.println(c.adresa  + " " + c.age + " " + c.name);

    }
}
