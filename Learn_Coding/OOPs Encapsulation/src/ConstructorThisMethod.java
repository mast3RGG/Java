class Student4 {
    private int year;
    private String fname;
    private int phoneNumber;

    public Student4(int year, String fname, int phoneNumber)
    {
        this("Alin");
        this.year = year;
        this.phoneNumber = phoneNumber;
    }
    public Student4(String fname){
        this.fname = fname;
    }
    public int getYear(){
        return year;
    }
    public String getFname(){
        return fname;
    }
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
}

public class ConstructorThisMethod {
    public static void main(String [] args)
    {
        Student4 st1 = new Student4(2006 , "Maxim" , 123123123);
        int year = st1.getYear();
        int phoneNumber = st1.getPhoneNumber();
        String fname = st1.getFname();

        System.out.println(year + phoneNumber + fname);

    }
}
