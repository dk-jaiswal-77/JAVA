@FunctionalInterface
interface I1 {
  void show();
}

class Example implements I1 {
  public void show() {
    System.out.println("Hello World!");
  }
}

public class Practice {
  I1 e1 = () -> System.out.println("Hello World!");
  e1.show();
}
