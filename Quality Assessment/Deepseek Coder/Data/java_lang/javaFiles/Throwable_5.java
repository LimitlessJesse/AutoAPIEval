import java.lang.Throwable;
import java.lang.StackTraceElement;

public class Throwable_5 {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement element : stackTraceElements) {
                System.out.println(element.toString());
            }
        }
    }

    public static void throwException() throws Exception {
        throw new Exception("This is an example exception");
    }
}
