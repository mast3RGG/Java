public class N4 {
    int indexFound(int val ,int ar[])
    {
        for(int i = 0 ; i < ar.length ;++i){
        if(val == ar[i])
            return i;
        }
        return  0;
    }

    public static void main(String[] args)
    {
        N4 index = new N4();
        int val , ar[] ;
        ar = new int [] {1 , 2, 3 , 4, 5, 6, 7, 8, 9,10};
        val = 3;
        int indexx = index.indexFound(val , ar);

        if(indexx!= 0)
            System.out.println(indexx);
        else
            System.out.println("Nu exista");


    }
}
