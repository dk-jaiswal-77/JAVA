package assignments;

class MyData<T> {
    T data;
    public void setData(T d) {
        data = d;
    }
    public T getData() {
        return data;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        MyData<Integer> m1 = new MyData<Integer>();
        m1.setData(new Integer(5));
        System.out.println(m1.getData());;
        MyData<String> m2 = new MyData<String>();
        m2.setData(new String("Dhirendra"));
        System.out.println(m2.getData());
    }
}
