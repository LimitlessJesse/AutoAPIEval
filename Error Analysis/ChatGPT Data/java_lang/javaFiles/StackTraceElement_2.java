import java.lang.StackTraceElement;

public class StackTraceElement_2 {
    public static void main(String[] args) {
        // Getting the current method's stack trace elements
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        
        // Printing the class name of the method that called this method
        if (elements.length > 2) {
            String className = elements[2].getClassName();
            System.out.println("Class name: " + className);
        } else {
            System.out.println("Unable to retrieve caller class name");
        }
    }
}
