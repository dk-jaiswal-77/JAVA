package assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment7 {
    public static void driver() {
        Complex complexNumber = new Complex();
        complexNumber.setComplex(10, 15);
        complexNumber.printComplex();

        Time t = new Time();
        t.setTime(2, 45, 30);
        t.printTime();

        Cuboid cuboid = new Cuboid();
        cuboid.setDimensions(2, 3, 5);
        cuboid.surfaceArea();
        cuboid.volume();
    }
}

class Cuboid {
    private int length, breadth, height;
    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    public void surfaceArea() {
        int area = (2 * (length * breadth + length * height + breadth * height));
        System.out.println("surface area of cuboid: " + area);
    }
    public void volume() {
        System.out.println("volume of cuboid: " + (length * breadth * height));
    }
}

class Complex {
    private int real, imaginary;
    public void setComplex(int r, int img) {
        real = r;
        imaginary = img;
    }
    public void printComplex() {
        System.out.println("real=" + real + " img=" + imaginary);
    }
}

class Time {
    private int hour, minute, second;
    public void setTime(int hr, int min, int sec) {
        hour = hr;
        minute = min;
        second = sec;
    }
    public void printTime() {
        System.out.println(hour + "hr" + minute + "min" + second + "sec");
    }
}

// Assignment 8

// example of singleton class || can create only single instance of this class
class SuperCar {
    private int price;
    private String ownerName;
    private SuperCar(int price, String ownerName){
        this.price = price;
        this.ownerName = ownerName;
    }
    private static SuperCar ref;
    public static SuperCar getSuperCar(int price, String ownerName) {
        if (ref == null) {
            ref = new SuperCar(price, ownerName);
            return ref;
        }
        return null;
    }
}

class Batch {
    private int batchCode;
    private String courseName;
    private LocalDateTime startDate;

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }
    public int getBatchCode() {
        return batchCode;
    }
}

class Box {
    private static int boxCount;
    private int length, breadth, height;
    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        boxCount++;
    }
}

