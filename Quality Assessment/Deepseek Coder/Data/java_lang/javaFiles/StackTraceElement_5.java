import java.lang.StackTraceElement;

public class StackTraceElement_5 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            if (stackTraceElement.isNativeMethod()) {
                System.out.println(stackTraceElement.getMethodName() + " is a native method.");
            } else {
                System.out.println(stackTraceElement.getMethodName() + " is not a native method.");
            }
        }
    }
}
