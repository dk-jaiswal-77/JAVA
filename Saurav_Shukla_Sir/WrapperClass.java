public class WrapperClass
{
    public static void main(String[] args)
    {
        Integer int1 = Integer.valueOf("123");
        Integer int2 = Integer.valueOf("100101", 2); // decimal equivalent will be stored
        Double doub1 = Double.valueOf("22.25");
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(doub1);
        System.out.println(int1.floatValue());
        System.out.println(int1.doubleValue());
        System.out.println(int1.longValue());
        System.out.println(Float.parseFloat("123.27"));
    }
}

