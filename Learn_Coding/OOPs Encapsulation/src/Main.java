import java.util.Arrays;

class Student{
    private int age;
    private String city;
    private String name;

    void setAge(int age)
    {
        this.age = age;
    }
    int getAge()
    {
        return age;
    }
    void setCity(String city){
        this.city = city;
    }
    String getCity(){
        return city;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
}
class Alin {
    public static void main(String[] args)
    {
    Student s1 = new Student();
    s1.setAge(20);
        System.out.println(s1.getAge());
    String s2 = "alin";
    }
    }
