class Store<T> {
  private T item;
  public void setItem(T theItem) {
    this.item = theItem;
  }

  public T getItem() {
    return this.item;
  }
}

class Hashtable<K, V> {
  private K key;
  private V value;
  public Hashtable(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Hashtable key = " + this.key + ", value = " + this.value;
  }
}

public class GenericTypes {
  public static void main(String [] args) {
     Store<String> store = new Store<>();
     store.setItem("Book");
     System.out.println(store.getItem());

    Hashtable<String, Integer> hashTable = new Hashtable<>("mark", 99);
    System.out.println(hashTable.toString());
  }
}