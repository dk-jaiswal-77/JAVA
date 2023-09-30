package assignments;

public class Assignment18 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Dhirendra", 23);
        System.out.println(p1.name);
        System.out.println(p1.age);

        Circle1 c1 = new Circle1();
        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());
    }
}

class Circle1 {
    public static final double PI;
    public double radius;
    static {
        PI = 3.14;
    }
    {
        radius = 5;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Circle1.PI * radius * radius);
    }
}

class Person1 {
    public String name;
    public int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }


}