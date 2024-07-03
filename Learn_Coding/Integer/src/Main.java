public class Main {
    public static void main(String[] args) {
        int i = 10; // Primitive int variable
        Integer i1 = Integer.valueOf(i); // Boxing: converting primitive int to Integer object using valueOf method
        Integer i2 = Integer.valueOf("10"); // Converting String to Integer object using valueOf method
        System.out.println(i2); // Prints 10 (value of i2)
        System.out.println(i1); // Prints 10 (value of i1)
        System.out.println(i); // Prints 10 (value of primitive int i)

        Integer max = Integer.valueOf(10);
        int maxInt = max.intValue();
        System.out.println(maxInt);
        Boolean bool = Boolean.valueOf("true");
        boolean b1 = bool.booleanValue();
        String age = "10";
        int b = Integer.parseInt(age);
        System.out.println(b);
        
    }
}