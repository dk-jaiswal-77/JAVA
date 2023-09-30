package pack1;
import pack2.Person;

public class Employee extends pack2.Person
{
    private String designation;
    public Employee(String d)
    {
        designation = d;
    }
    public void setDesignation(String d)
    {
        designation = d;
    }
    public String getDesignation()
    {
        return designation;
    }
}
