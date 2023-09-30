public class CommandLineArguments {
    public static void printAllArguments(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }

    public static void main(String[] args) {
        printAllArguments(args);
    }
}
