class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        Integer res = this.age - otherPerson.getAge();
        if (res < 0) return -1;
        if (res > 0) return 1;
        return 0;
    }
}

public class BoundedTypeParameters {
    public static <T extends Comparable<T>> T calculateMin(T item1, T item2) {
        Integer val = item1.compareTo(item2);
        if (val <= 0) return item1;
        return item2;
    }
    public static void main(String[] args) {
        System.out.println(calculateMin(12, 6));
        System.out.println(calculateMin(new Person("Dhirendra", 25), new Person("Sbhubam", 12)));
    }
}
