public class Main {
  public static void main(String [] args) {
    GenericMethod genericMethod = new GenericMethod();

    // String name = genericMethod.printItem("my name is Dhirendra.");
    // System.out.println(name);
    // Double mark = genericMethod.printItem(99.5);
    // System.out.println(mark);

    genericMethod.printItems("Dhirendra", 25);

    String [] names = {"dhirendra", "shubham", "soham"};
    genericMethod.print(names);

    Integer [] ages = {25, 12, 10};
    genericMethod.print(ages);

  }
}
