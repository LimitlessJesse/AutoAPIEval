import java.lang.StackTraceElement;

public class StackTraceElement_4 {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println("Method Name: " + element.getMethodName());
        }
    }
}
