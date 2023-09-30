public class HelloWorld {
    public static int unitDigit(int num) {
        return (num % 10);
    }

    public static int numWithoutLastDigit(int num) {
        return (num / 10);
    }

    public static void swapValues(int a, int b) {
        // using third variable
        int c = a;
        a = b;
        b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int rotateNum(int num) {
        int numWithoutLastDigit = num / 10;
        int lastDigit = num % 10;
        int rotatedNum = Integer.valueOf(String.valueOf(lastDigit) + String.valueOf(numWithoutLastDigit));
        return rotatedNum;
    }

    public static boolean isPositiveNumber(int num) {
        return (num > 0);
    }

    public static int makeLastDigitZero(int num) {
        int lastDigit = num % 10;
        return (num - lastDigit);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        int divisor = num;
        int remainder;
        while (divisor > 0) {
            remainder = divisor % 10;
            sum += remainder;
            divisor /= 10;
        }
        return sum;
    }

    public static int reverseThreeDigitNumber(int num) {
        int multiplyBy = 1;
        int reversedNum = 0;
        int divisor = num;
        int remainder;
        while (divisor > 0) {
            remainder = divisor % 10;
            reversedNum = reversedNum * multiplyBy + remainder;
            multiplyBy *= 10;
            divisor /= 10;
        }
        return reversedNum;
    }

    public static void firstTenMultipleOf(int num) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    public static void firstTenOddNumbers() {
        int maxCount = 10;
        int currentCount = 1;
        int prevOddNumber = 1;
        String res = "";
        while (currentCount <= maxCount) {
            res = res + " " + prevOddNumber;
            prevOddNumber += 2;
            currentCount++;
        }
        res = res.trim();
        System.out.println(res);
    }

    public static void swapValuesWithoutThirdVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args){
//        System.out.println("Hello world!");
//        System.out.println("Hello\nworld"); // new line
//        System.out.println("Hello\bworld"); // backspace
//        System.out.println("Hello\tworld"); // tab space
////        System.out.print("Hello World 1\r"); // carriage return
//        System.out.println("Hello World 2 \f");
//        System.out.println("Hello World\n\n\n");
//        System.out.println("Testing...");
//        System.out.println("\"MySirG\"");
//        System.out.println("\"Teacher's Day\"");
//        int x = 10;
//        System.out.println(x);
//        float y = 10.77f;
//        System.out.println(y);

//        int num = 445555;
//        System.out.println(unitDigit(num));
//        System.out.println(numWithoutLastDigit(num));
        /*
        * value type variable ---> variable that holds primitive data type
        * nullable type variable || reference variable  ---> variable that contains reference or null
        * */

//        System.out.println(rotateNum(num));
//        System.out.println(isPositiveNumber(-1));
//        System.out.println(isPositiveNumber(0));
//        System.out.println(isPositiveNumber(5));

        char ch = 'A';
//        System.out.println(++ch);
        int num = 2334;
//        System.out.println(makeLastDigitZero(num));

//        System.out.println(sumOfDigits(12304));

//        System.out.println(reverseThreeDigitNumber(123456));
//        firstTenMultipleOf(5);

//        firstTenOddNumbers();

        swapValuesWithoutThirdVariable(-15, 30);
    }
}