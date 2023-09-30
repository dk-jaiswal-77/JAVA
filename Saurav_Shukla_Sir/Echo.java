package world;
public class Echo
{
    public static void main(String[] args)
    {
        String collection = "";
        int sum = 0;
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
            collection += args[i];
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(collection);
        System.out.println("Sum is " + sum);
    }
}
