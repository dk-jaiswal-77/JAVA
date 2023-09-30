import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void CalcPercentage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Maths: ");
        float markMath = sc.nextFloat();
        System.out.println("Enter marks of Physics: ");
        float markPhysics = sc.nextFloat();
        System.out.println("Enter marks of Chemistry: ");
        float markChemistry = sc.nextFloat();
        System.out.println("Enter marks of Computer Science: ");
        float markCS = sc.nextFloat();
        System.out.println("Enter marks of English: ");
        float markEnglish = sc.nextFloat();
        float totalObtainedMarks = markMath + markPhysics + markChemistry + markCS + markEnglish;
        int totalFullMarks = 500;
        float percentage = (totalObtainedMarks / totalFullMarks) * 100;
        System.out.println("Percentage is: " + percentage);
    }

    public static void greet(String name) {
        System.out.printf("Dear %s, thanks a lot!", name);
    }

    public static void detectDoubleSpaces(String str) {
        System.out.println(str.indexOf("  ") > -1);
    }

    public static void isPassed(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Maths: ");
        byte math = sc.nextByte();
        
        System.out.println("Enter marks of Science: ");
        byte science = sc.nextByte();

        System.out.println("Enter marks of English: ");
        byte english = sc.nextByte();

        if (math < 33 || science < 33 || english < 33) {
            System.out.println("Fail!");
            return;
        }

        float avg = (math + science + english) / 3.0f;
        if (avg < 40) {
            System.out.println("Fail");
            return;
        }
        System.out.println("Pass...");
    }

    public static void findDay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for the day: ");
        byte num = sc.nextByte();
        num = (byte) (num % 7);
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int num2 = sc.nextInt();
        // int sum = num1 + num2;
        // System.out.println("Sum of both the numbers is: " + sum);

        // CalcPercentage();

        // is entered number an integer
        // boolean isInteger = sc.hasNextInt();
        // System.out.println(isInteger);
        // char c = 'A';
        // int n = 13;
        // int total = c + n;
        // System.out.println(total);

        // store grade in encrypted form & print in decrypted form
        char grade = 'B';
        grade = (char)(grade + 8);
        // System.out.println(grade);
        // System.out.println((char)(grade - 8));

        String name = "Dhirendra";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2, 3));
        System.out.println(name.replace('r', 'b'));
        System.out.println(name.replace("dra", "z"));
        System.out.println(name.charAt(7));
        System.out.println(name.indexOf('r', 9));        
        System.out.println(name.startsWith("Dhi"));
        System.out.println(name.endsWith("draa"));
        System.out.println(name.endsWith("dra"));
        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.lastIndexOf('r', 6));
        System.out.println(name.equals("Dhirendra"));
        System.out.println(name.equals("Dhirendr"));
        System.out.println(name.equalsIgnoreCase("dhirendra"));
        // escape sequence character
        System.out.println("I am escape sequence \" double quote");
        System.out.println("Dhirendra Kumar Jaiswal".replace(' ', '_'));

        greet("Dhirendra");
        System.out.println();
        greet("Subham");
        System.out.println();

        detectDoubleSpaces("Dhirendra  Kumar  Jaiswal");

        System.out.println("Dear Harry.\n\tThis Java course is useful.\n\tThanks");

        // isPassed();

        findDay();
    }
}
