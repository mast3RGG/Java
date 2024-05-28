class Employee2 {
    int id;
    String adress;
    String name;

    public Employee2(int id, String adress, String name)
    {
        this.id = id ;
        this.adress = adress;
        this.name = name;
    }

}

class Department {
    private int id;
    private String name ;
    Employee2 [] emps;

    public Department (int id , String name , Employee2 [] emps)
    {
        this.id = id;
        this.name = name ;
        this.emps = emps;
    }
    public void getData()
    {
        System.out.println("Departments :");
        System.out.println(id);
        System.out.println(name);
        System.out.println();
        System.out.println("Employes name");
        System.out.println("---------------------");
        for (Employee2 employee : emps)
        {
            System.out.println(employee.adress);
            System.out.println(employee.id);
            System.out.println(employee.name);
        }
    }
}
public class ManyToOne {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1 , "A1" , "Alin");
        Employee2 e2 = new Employee2(2 , "B1" , "Maxim");
        Employee2 e3 = new Employee2(3 , "C1" , "Adrian");

        Employee2 [] emps = new Employee2[3];
        emps[0]= e1;
        emps[1] = e2;
        emps[2]=e3;

        Department department = new Department(10 , "Human Resourcing" , emps);
        department.getData();

    }
}
