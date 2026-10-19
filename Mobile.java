public class Mobile
{
    String brand;
    String model;
    int year;
    public static void main(String[] args)
    {
        Mobile m=new Mobile();
        m.brand="Samsung";
        m.model="Galaxy S21";
        m.year=2025;
        System.out.println("Mobile Details:");
        System.out.println("Brand: " + m.brand);
        System.out.println("Model: " + m.model);
        System.out.println("Year: " + m.year);
    }
}