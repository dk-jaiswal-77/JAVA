public class Box
{
    private int l, b, h;
    public Box()
    {
        l = 10;
        b = 8;
        h = 5;
    }
    // constructor can be overloaded and parameterized
    public Box(int L, int B, int H)
    {
        l = L;
        b = B;
        h = H;
    }
    public static void main(String []args)
    {
        Box box1 = new Box();
        Box box2 = new Box(15, 10, 5);
    }
}
