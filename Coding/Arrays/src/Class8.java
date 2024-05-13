public class Class8 {
    public static void main(String[] args){
       //WAP  sum ellements of an array;

        int [] ar;
        ar = new int[] {1 , 2 ,3 ,4 ,5};
        int s = 0 ;
        for(int elem : ar)
        {
            s += elem;
        }
        System.out.println(s);
    }
}
