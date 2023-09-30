package assignments;

public class GenericMethod {
    public <E> void printArray(E [] arr) {
        for(E ele: arr) {
            System.out.println(ele);
        }
    }
    public static void main(String [] args) {
        GenericMethod p1 = new GenericMethod();
        String [] countries = new String []{"Nepal", "India"};
        Integer [] numbers = new Integer[]{1, 2, 3};
        p1.printArray(countries);
        p1.printArray(numbers);
    }
}
