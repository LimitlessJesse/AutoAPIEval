import java.lang.Runtime;

public class Runtime_3 {
    public static void main(String[] args) {
        System.out.println("Program will exit now.");
        Runtime.getRuntime().exit(0);
        System.out.println("This message will not be printed as the program has exited.");
    }
}
