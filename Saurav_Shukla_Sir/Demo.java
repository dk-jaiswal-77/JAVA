package pack2;
import pack1.Student;
public class Demo
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setRollNo(10);
        s1.setName("Dhirendra Kumar Jaiswal");
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
    }
}
