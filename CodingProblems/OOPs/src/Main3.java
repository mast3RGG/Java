class Rectangle
{
    float width;
    float height;

    public Rectangle(float width , float height)
    {
        this.width = width;
        this.height = height;
    }

    public float calculatePerimeter()
    {
        float permiter;

        permiter = (width + height)*2;

        return permiter;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23.4F , 21.0F);
        float permieter = r1.calculatePerimeter();
        System.out.println(permieter);
    }
}
