import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class Plane
{
    public void fly()
    {
        System.out.println("Plane is flying medicore heght");
    }
    public void takeOf()
    {
        System.out.println("Plane is taking of today");
    }

    public void landing()
    {
        System.out.println("Plane is landing tonight");
    }
}

class PassengerPlane extends Plane{
    public void fly()
    {
        System.out.println("Plane is flyng at 10000meters");
    }
}

class CargoPlane extends Plane{
    public void fly()
    {
        System.out.println("Plane is flying at 6000 meters");
    }
}

class FightPlane extends Plane{
    public void fly()
    {
        System.out.println("Plane is flyig at 12000 meters");
    }
    public void landing()
    {
        System.out.println("Plane is landing tommorrow morning");
    }
}

class Airoport{
    public void airoport(Plane plane)
    {
        plane.fly();
        plane.landing();
        plane.takeOf();
    }
}
public class Main {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        FightPlane fp = new FightPlane();

        Airoport a = new Airoport();
        a.airoport(pp);
        a.airoport(cp);
        a.airoport(fp);
    }
}
