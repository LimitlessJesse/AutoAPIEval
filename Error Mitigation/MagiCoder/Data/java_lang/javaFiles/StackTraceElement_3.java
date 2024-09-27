import java.lang.StackTraceElement;

public class StackTraceElement_3 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                System.out.println("Line number: " + stackTraceElement.getLineNumber());
            }
        }
    }

    public static void method1() throws Exception {
        throw new Exception();
    }
}
