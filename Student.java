public class Student
{
    String name;
    int age;
    int rollNumber;
    public static void main(String[] args)
    {
        Student s=new Student();
        s.name="John";
        s.age=20;
        s.rollNumber=1;
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Roll Number: " + s.rollNumber);
    }

}