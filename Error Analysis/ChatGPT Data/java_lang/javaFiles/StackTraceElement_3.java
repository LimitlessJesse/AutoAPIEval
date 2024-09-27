import java.util.Arrays;

public class StackTraceElement_3 {
    public static void main(String[] args) {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        
        // Get the method name of the caller
        String methodName = elements[1].getMethodName();
        System.out.println("Method name: " + methodName);
    }
}
