import java.util.Arrays;

class Test{
    public static void main(String[] args)
    {
//        String s1 = "Alin";
//        System.out.println(s1);
//        String s2 = new String("Maxim");
//        System.out.println(s2);

//        StringBuilder s1 = new StringBuilder("Alin");
//        System.out.println(s1);
//        String alin = "Alin";
//        String s2 = alin.concat("Maxim");
//        System.out.println(s2);


          String s1 = "Alin";
          String s2 = new String("Alin");
          System.out.println(s1 == s2);//false not pointing to the same object
        System.out.println(s1.equals(s2));//true

    }

        }