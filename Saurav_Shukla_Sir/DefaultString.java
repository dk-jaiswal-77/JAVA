import javax.sound.sampled.SourceDataLine;

public class DefaultString {
  public static void main(String[] args){
    // java.lang.String ---> final class --> no class can extend it
    String s1 = "computer";
    String s2 = "computer";
    String s3 = new String("computer");
    System.out.println(s1 == s2); // true
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s3); // false
    System.out.println(s1.equals(s3)); // true // method of Object class // compares object data


    // methods in String class object
    // .indexOf(), .lastIndexOf()

    // character index search
    String str = new String("Computer Programming");
    System.out.println(str.indexOf('m')); // 2
    System.out.println(str.indexOf('m', 10)); //15
    System.out.println(str.indexOf('m', 16)); // 16
    System.out.println(str.indexOf('m', 100)); // -1

    // character last index search
    System.out.println(str.lastIndexOf('m'));
    System.out.println(str.lastIndexOf('r', 9));

    // string index search
    System.out.println(str.indexOf("Pro")); // 9
    System.out.println(str.indexOf("Pro", 10)); // -1

    // string last index search
    System.out.println(str.lastIndexOf("er", 5)); // -1



    // .equals()
    String str1 = new String("Computer");
    String str2 = new String("computer");
    if (str1.equals(str2))
      System.out.println("strings are equal...");
    else
      System.out.println("strings are not equal...");

    // .equalsIgnoreCase()
    if (str1.equalsIgnoreCase(str2))
      System.out.println("strings are equal...");
    else
      System.out.println("strings are not equal...");
    
    // .compareTo()
    int comparisonRes = str1.compareTo(str2);
    if( comparisonRes == 0)
      System.out.println("same string...");
    else if (comparisonRes > 0)
      System.out.println("opposite to dictionary order"); 
    else
      // -ve
      System.out.println("same as dictionary order");

    // .substring(beginIndex, endIndex)
    System.out.println(str1.substring(2));
    System.out.println(str1.substring(1, 5)); // upton endIndex // endIndex is not included
  }
}
