package assignments;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;
public class Assignment11 {
    public static void printDate() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("current time " + now);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("formatted date " + f.format(now));
    }
    public static void printTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("current time " + now);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("current time " + f.format(now));
    }

    public static void printRandomNumber() {
        double randomNumber = Math.random() * 100 + 100;
        System.out.println((int)randomNumber);
    }

    public static void main(String[] args) {
//        printDate();
//        printTime();
        printRandomNumber();
    }
}
