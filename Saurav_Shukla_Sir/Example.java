class Box
{
    private int length, breadth, height;
    public void setDimensions(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimensions()
    {
        System.out.println("L = " + length);
        System.out.println("B = " + breadth);
        System.out.println("H = " + height);
    }
}

public class Example
{
    public static void main(String[] args)
    {
        Box smallBox = new Box();
        smallBox.setDimensions(15, 10, 5);
        smallBox.showDimensions();
        smallBox = new Box();
        smallBox.showDimensions();
    }
}

/*
 * length, breadth, height ---> instance member variables
 * setDimensions, showDimensions ---> instance member methods
*/
