interface IOne{
    void display();
}
public class Class3 implements IOne {
    public static void main(String[] args) {
        String age = "10";
        int age1 = Integer.parseInt(age);
        Integer age2 = Integer.valueOf(age1);
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);

    }

    @Override
    public void display() {
        System.out.println("ALIN");
    }
}
