abstract class Person {
  private String name;
  private int age;
  public void setName(String n) {
    name = n;
  }
  public void setAge(int a) {
    age = a;
  }
}

class Student extends Person {
  // inhertis Person
}

class Teacher extends Person {
  // inhertis Person
}


public class AbstractClass {
  public static void main(String[] args){
    Person person1 = new Person(); // error // cannot instantiate abstract class
    Student student1 = new Student(); // contains instance members of Student & Person
    Teacher teacher1 = new Teacher(); // contains instance members of Teacher & Person
  }
}
