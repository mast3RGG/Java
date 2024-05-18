class CopyString
{
    public static void main(String[] args)
    {
        String s1 = "AlinMorgoci";
        String s2 = "";

        for(int i = 0 ; i < s1.length(); i++)
        {
            s2 += s1.charAt(i);
        }
        System.out.println("Copyed String is " + s2);
        System.out.println(s1.equals(s2));
    }
}