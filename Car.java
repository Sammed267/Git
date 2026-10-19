public class Car
{
    String model;
    int year;
    String color;
    public static void main(String[] args)
    {
        Car c=new Car();
        c.model="Toyota";
        c.year=2020;
        c.color="Red";
        System.out.println("Car Details:");
        System.out.println("Model: " + c.model);
        System.out.println("Year: " + c.year);
        System.out.println("Color: " + c.color);
    }
}