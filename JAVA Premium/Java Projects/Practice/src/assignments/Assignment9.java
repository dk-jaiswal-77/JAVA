package assignments;
import java.lang.Math;

public class Assignment9 {
    public static void Driver() {

    }
}

class Circle {
    private Integer radius;
    public void setRadius(int r) {
        radius = Integer.valueOf(r);
    }
    public int getRadius() {
        return radius.intValue();
    }
    public double getArea() {
        return (Math.PI * radius * radius);
    }
    public double getCircumference() {
        return (2 * Math.PI * radius);
    }
}

class Marksheet {
    private Double Maths, Physics, English;
    public void setMarks(double m, double p, double e) {
        Maths = m;
        Physics = p;
        English = e;
    }
    public Double maxMark() {
        Double max = 0.0;
        if (Maths > max) max = Maths;
        if (Physics > max) max = Physics;
        if (English > max) max = English;
        return max;
    }
}
