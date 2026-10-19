public class Vegetables
{
    String name;
    String color;
    int price;
    public static void main(String[] args)
    {
        Vegetables v=new Vegetables();
        v.name="Carrot";
        v.color="Orange";
        v.price=30;
        System.out.println("Vegetable Details:");
        System.out.println("Name: " + v.name);
        System.out.println("Color: " + v.color);
        System.out.println("Price: " + v.price);
    }
}