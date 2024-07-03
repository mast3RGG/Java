class Student {
    static {
        System.out.println("Construcor is loading");
    }

    public Student()
    {
        System.out.println("Constructor loaded");
    }
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = args[0];

        Class c = Class.forName(className);

        Object obj = c.newInstance();
        Student student = (Student)obj;

        Object obj1 = Class.forName(args[0]).newInstance();
    }
}