class Plane {
        public void fly()
        {
            System.out.println("Plane is flying");
        }
        public void land()
        {
            System.out.println("Plane is landing");
        }
        public void takeOf()
        {
            System.out.println("Plane is takeing off");
        }
}

class CargoPlane extends Plane{
    public void fly()
    {
        System.out.println("Cargo Plane is flying at lower heigt ");
    }
    public void carryGood()
    {
        System.out.println("Cargo palne carry goods");
    }
}

class PassengerPlane extends Plane{
    public void fly()
    {
        System.out.println("Passenger plany is flyinh at medium hegiht");
    }
    public void carryPersons()
    {
        System.out.println("Passanger plane carry persons");
    }

}


public class UmlDemonstration {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();

    }
}