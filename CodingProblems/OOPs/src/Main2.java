class Dog
{
    String name;
    String breeds;

    public Dog (String name , String breeds)
    {
        this.name = name;
        this.breeds = breeds;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setBreeds(String breeds)
    {
        this.breeds = breeds;
    }

    public void disp()
    {
        System.out.println("Nume "+ name + " " + breeds);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bark" , "GermanSepherd");
        Dog d2 = new Dog("Lola" , "GermanSepherd");

        d1.setBreeds("Dwarf");
        d1.setName("Kiki");

        d1.setName("Ceapy");
        d1.setBreeds("Dwarf");

        d1.disp();
        d2.disp();
    }
}
