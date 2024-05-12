class Car{
    int year;
    int noOfWheels;
    String name;
}

public class Class4
{
    public static void main (String [] args)
    {
        Car[] car = new Car[3];
        car[0] = new Car();
        car[1] = new Car();
        car[2] = new Car();

        car[0].name = "BMW";
        car[0].noOfWheels = 4;
        car[0].year = 2000;

        System.out.println(car[0]);
        for(int i = 0 ; i<car.length ; i++)
        {
            System.out.print(car[i] + " ");
        }

    }
}