//method overloading with numeric type promotion(Implicit TypeCasting)
class Calculator2{
    float add(float a , int b)
    {
        return a + b;
    }

    float add(int a , float b , float c)
    {
        return a+b+c;
    }

}
public class MethodOLCS1 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println(calc.add(2 , 4));
    }
}
