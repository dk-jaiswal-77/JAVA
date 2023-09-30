import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    public static void printAll(List<? super Number> list) {
        for (Object item: list)
            System.out.println(item);
    }

    public static void main(String [] args) {
        List<? super Integer> list1 = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        List<? super Integer> list3 = new ArrayList<Object>();

        // how to read items using lower bounded wildcard
        List<Serializable> names = new ArrayList<>();
        names.add("Dhirendra");
        names.add("Shubham");
        names.add("Rishu");
        printAll(names);

        // insert items
        List<? super Number> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(3.4);
        list4.add(44.4f);
    }
}
