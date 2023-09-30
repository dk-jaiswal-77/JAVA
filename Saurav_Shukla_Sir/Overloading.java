class A {
    public void func1(int x) {
        System.out.println("class A");
    }
}

class B extends A {
    public void func1(int x, int y) {
        System.out.println("class B");
    }
}

public class Overloading {
    public static void main(String[] args) {
        B obj = new B();
        obj.func1(5);
        obj.func1(5, 6);
    }
}
