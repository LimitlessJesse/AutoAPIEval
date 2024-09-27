import java.util.Arrays;

public class StackTraceElement_1 {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        for (StackTraceElement element : stackTrace) {
            System.out.println("Method name: " + element.getMethodName() + " Line number: " + element.getLineNumber());
        }
    }
}
