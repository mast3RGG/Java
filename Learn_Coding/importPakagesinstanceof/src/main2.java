@FunctionalInterface
interface IInterface1 {
     void disp();
}
@FunctionalInterface
interface IInterface2{
     int sum(int a);
}
public class main2 {
     public static void main(String[] args) {
          IInterface1 i1 = ()->{
               System.out.println("disp");
          };
          i1.disp();

          IInterface1 i2 = new IInterface1() {
               @Override
               public void disp() {
                    System.out.println("disp2");
               }
          };
          i2.disp();


          IInterface1 i3 = () -> System.out.println();

          IInterface2 s2 = a -> a + 20;
          System.out.println(s2.sum(40));

          IInterface2 s1 = new IInterface2() {
               @Override
               public int sum(int a) {
                    return 20+a;
               }
          };
          System.out.println(s1.sum(20));
         Implements implement = new Implements();
          System.out.println(implement.sum(100));
     }
}

class Implements implements IInterface2
{
     @Override
     public int sum(int a) {
          return 20 +a;
     }
}