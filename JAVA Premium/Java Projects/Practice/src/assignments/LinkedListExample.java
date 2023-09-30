package assignments;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String [] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(new String("Dhirendra"));
        l1.add(1, new String("Kumar"));
        l1.addLast(new String("Jaiswal"));

        System.out.println(l1.getFirst());
        System.out.println(l1.get(1));
        System.out.println(l1.getLast());
    }
}
