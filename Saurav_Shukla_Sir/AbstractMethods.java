abstract class Person {
  public abstract void show();
}

class Student extends Person {
  // to prevent Student class from being abstract class
  // over-ride abstract method present in its parent i.e. Person class
  public void show() {
    // code
  }
}

public class AbstractMethods {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.show();
  }
}
