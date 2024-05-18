public class Reversing {
    static String reversePalindrome(String s , String s2)
    {
        for(int i = s.length() -1 ; i >= 0 ; i--)
        {
            s2+= s.charAt(i);
        }
        return s2;
    }
    static String reverseWordsButSameArangament(String s , String s2)
    {
        String [] arr = s.split(" ");
        for(String elem : arr) {
            for (int i = elem.length() - 1; i >= 0; --i)
                s2 += elem.charAt(i);

            s2 += " ";
        }
        return  s2;
    }

    static String reverseWords(String s1 , String s2)
    {
        String arr [] = s1.split(" ");
        for(int i = arr.length - 1; i >= 0 ; --i)
        {
            s2 += arr[i] + " ";
        }
        return  s2;
    }
    public static void main(String[] args){
        String s1 = "Alin Mogoci";
        String s2 = "";

        s2 = reverseWords(s1,s2);
        System.out.println(s2);

    }

}
