import java.lang.StackTraceElement;

public class StackTraceElement_3 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElements) {
            System.out.println("Class Name: " + element.getClassName());
            System.out.println("Method Name: " + element.getMethodName());
            System.out.println("FileName: " + element.getFileName());
            System.out.println("Line Number: " + element.getLineNumber());
        }
    }
}
