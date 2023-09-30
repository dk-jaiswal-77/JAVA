import java.util.ArrayList;
import java.util.List;

public class TypeWitness {
    public static <T> void addToList(T item, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(item);
        list.add(bucket);
        System.out.println(item.toString() + " is added to the list...");
    }
    public static void main(String [] args) {
        List<Bucket<String>> list = new ArrayList<>();
        TypeWitness.addToList("Adam", list);
        // type witness
        TypeWitness.<String>addToList("Adam", list);
    }
}

class Bucket <T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

