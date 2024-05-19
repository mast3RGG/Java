import java.rmi.StubNotFoundException;

class Student1{
    private int age;
    private String name;
    private String city;

    public Student1(int age , String name , String city)
    {
        System.out.println("You instatiated variables are : ");
        this.age = age;
        this.name = name;
        this.city = city;
        System.out.println(age + " " + name + " " + city);
    }
}


class Class2 {
    public static void main(String[] args){
    Student1 st1 = new Student1(20 , "Telenesti" , "City");
}}
