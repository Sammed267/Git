public class Employee
{
    String name;
    int age;
    int employeeId;
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.name="Alice";
        e.age=30;
        e.employeeId=101;
        System.out.println("Sam");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Employee ID: " + e.employeeId);
    }
}