import java.lang.StackTraceElement;

public class StackTraceElement_3 {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        for (StackTraceElement element : stackTrace) {
            System.out.println("Class Name: " + element.getClassName());
            System.out.println("Method Name: " + element.getMethodName());
            System.out.println("File Name: " + element.getFileName());
            System.out.println("Line Number: " + element.getLineNumber());
            System.out.println();
        }
    }
}
