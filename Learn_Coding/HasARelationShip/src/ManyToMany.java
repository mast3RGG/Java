class Courses
{
    int cId;
    String name;
    double cost;

    public Courses(int cId, String name, double cost) {
        this.cId = cId;
        this.name = name;
        this.cost = cost;
    }
}

class StudentHighschool {
    private int id;
    private String name;
    private String adress;
    private Courses[] courses;

    public StudentHighschool(int id, String name, String adress, Courses[] courses) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.courses = courses;
    }

    public void getStudentData(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(adress);
        System.out.println("Courses");
        for(Courses c : courses)
        {
            System.out.println(c.cId);
            System.out.println(c.cost);
            System.out.println(c.name);
        }
    }
}

public class ManyToMany {
    public static void main(String[] args) {
        Courses c1 = new Courses(1 , "Java" ,  1000.00);
        Courses c2 = new Courses(2 , "Python" ,  2000.00);
        Courses c3 = new Courses(3 , "BlockChain" ,  3000.00);

        Courses courses [] = new Courses[3];
        courses[0] = c1;
        courses[1]= c2;
        courses[2] = c3;

        StudentHighschool sh = new StudentHighschool(100, "Alin" ,"eugeniu" , courses);
        StudentHighschool sh2 = new StudentHighschool(200, "Maxim" ,"eugeniu" , courses);
        StudentHighschool sh3 = new StudentHighschool(300, "Adrian" ,"eugeniu" , courses);

        sh.getStudentData();
        sh2.getStudentData();
        sh3.getStudentData();
    }
}
