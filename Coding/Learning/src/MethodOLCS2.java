//Compiler is confused witch one to pick
class Calculator3{
    float add(float a , int b)
    {
        return a + b;
    }

    float add(int a , float b)
    {
        return a+b;
    }

}

public class MethodOLCS2 {
    public static void main(String[] args)
    {
        Calculator3 calc3 = new Calculator3();
        float c = calc3.add(23.f,3);
        System.out.println(c);
    }
}
