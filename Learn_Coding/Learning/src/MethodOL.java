//Method OverLoaading
//Reffers to process of writing more than one method with same name and different parameters within same class
//earlybinding / CompileTimePolymorfism
//Compiler Resolve the confict :
//a) Numbers of parameters b)Daya type of parameters c)Oder of datatype of parameters

class Calculator{
    int add(int a , int b)
    {
        return a + b;
    }

    float add(int a , float b, int i)
    {
        return a+b;
    }

    float add (float a , float b)
    {
        return   a+b;
    }
    float add (float a , int b)
    {
        return a + b;
    }
}


class MethodOL {
    public static void main(String[] args) {
        {
            int a = 10, b = 20;
            float c = 14f, d = 15f;
            Calculator cal = new Calculator();
            System.out.println(cal.add(a, b));
            System.out.println(cal.add(14.3f, 14.4f));

        }
    }
}