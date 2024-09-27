import java.lang.StackTraceElement;

public class StackTraceElement_5 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.isNativeMethod()) {
                System.out.println("Native method: " + element.getMethodName());
            }
        }
    }
}
