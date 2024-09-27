import java.lang.StackTraceElement;

public class StackTraceElement_2 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement mainMethod = stackTraceElements[stackTraceElements.length - 1];
        System.out.println(mainMethod.getMethodName());
    }
}
