import java.lang.StackTraceElement;

public class StackTraceElement_5 {
    public static void main(String[] args) {
        StackTraceElement element = new Exception().getStackTrace()[0];
        System.out.println("Is native method: " + element.isNativeMethod());
    }
}
