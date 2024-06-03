interface IOne {
    void disp();
    void calculate();
}

abstract class  Implemets1 implements IOne
{
    @Override
       public void disp() {
        System.out.println("Alin");
    }
}

class Implemets2 extends Implemets1 {
    public void calculate()
    {
        System.out.println("Calculare");
    }

    @Override
    public void disp() {
        System.out.println("Alin2");
    }
}

class Test
{
    public static void main(String[] args) {
        IOne obj1 = new Implemets2();
        obj1.calculate();
        obj1.disp();
    }
}