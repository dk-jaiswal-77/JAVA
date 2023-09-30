import pack1.Employee;
public class Demo1
{
    public static void main(String []args)
    {
        Employee e1 = new pack1.Employee("software engineer");
        System.out.println(e1.getDesignation());
        e1.setName("Dhirendra");
        System.out.println(e1.getName());
    }
}
