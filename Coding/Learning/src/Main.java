class Alin{
    int a ,b ,c;
    public static void main(String [] args)
    {
        Alin sum1 = new Alin();
        int c = sum1.add(10,20,30);
        System.out.println(c);
    }

    int add(int a, int b , int c)
    {
        int res = a + b + c;
        return res;
    }
}

