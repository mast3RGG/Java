class Aliona
{

}

class Alin extends Aliona
{

}

class Copil {
    public int i = 10;
    public Aliona disp()
    {
        Aliona al = new Aliona();
        return al;
    }
}


class CopilC extends Copil
{
    public int i = 20;
    public Alin disp()
    {
        Alin al = new Alin();
        return al;
    }

    public void display()
    {
        System.out.println(i);
        System.out.println(super.i);
    }
}


public class Class4 {
    public static void main(String[] args) {
       CopilC copil = new CopilC();
       copil.display();  
    }
}