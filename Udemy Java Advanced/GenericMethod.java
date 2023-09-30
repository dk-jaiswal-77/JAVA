public class GenericMethod {
  public <T> T printItem(T item) {
    System.out.println("item is : " + item);
    return item;
  }

  public <T, V> void printItems(T item1, V item2) {
    System.out.println(item1);
    System.out.println(item2);
  }

  public <T> void print(T [] items) {
    for (T item: items) {
      System.out.println(item);
    }
  }
}
