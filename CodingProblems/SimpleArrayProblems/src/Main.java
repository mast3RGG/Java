public class Main{
    public static void main(String[] args){
        int [] ar = {1 , 2, 3,4 ,5 ,6 ,7 ,8, 9,10};
        double avg;
        int sum = 0;

        for(int elem : ar)
            sum+=elem;
        avg = (double)sum / ar.length;
        System.out.println(avg);
    }
}