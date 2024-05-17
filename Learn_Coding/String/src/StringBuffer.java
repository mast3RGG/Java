public class StringBuffer {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abcdefghinasdinasdibasduasbduiasbdiuasbdubasuidbasdiu");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("a");
        System.out.println(sb.capacity());
        sb.append("saihdasudgasiudgasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiasoiydgsayiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        java.lang.StringBuffer sb2 = new java.lang.StringBuffer();
        java.lang.StringBuffer sb3 = new java.lang.StringBuffer();
        sb3.append("AlinMorgoci");
        System.out.println(sb3.charAt(3));
        sb3.setCharAt(3 , 'N');
        System.out.println(sb3);
        java.lang.StringBuffer sb4 = new java.lang.StringBuffer();
    }
}
