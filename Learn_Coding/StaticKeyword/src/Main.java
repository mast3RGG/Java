

class Demo{
    int x , b;

    {
     x = 10;
     b = 10;
        System.out.println(x + " " + b);
    }
    {
        System.out.println("Second block");
    }

    static int a ,c ;
    static {
        System.out.println("alin");
        a =15;
        c = 20;
        afisare();
    }
    static void afisare(){
        System.out.println(a + " "+c);
    }
}
public class Main {
    public static void main(String[] args) {

        Demo d1 = new Demo();
      }
    }
