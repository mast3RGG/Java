public class InterchangeCases {
    static void method1(String s1) {
        if (s1 == s1.toUpperCase())
            System.out.println(s1.toLowerCase());
        else
            System.out.println(s1.toUpperCase());
    }

    static void method2(String s, String s2) {
        for (int i = 0; i < s.length(); ++i) {
            s2 += (char) (s.charAt(i) - 32);
        }
    }

    static String reverseCases(String s, String s2) {
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                s2+=(char)(s.charAt(i) - 32);
            }
            else
                s2 += (char)(s.charAt(i)+32);

        }
        return s2;
    }
    public static void main(String[] args)
    {
        String s1 = "AlnNIng";
        String s2 = "";
//        method1(s1);
//        method2(s1 , s2);
        s2 = reverseCases(s1 , s2);
        System.out.println(s2);
    }
}
